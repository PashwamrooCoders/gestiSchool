package pashwamroo.zyt.gestischool.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pashwamroo.zyt.gestischool.dao.EleveDao;
import pashwamroo.zyt.gestischool.dto.EleveRepresentation;
import pashwamroo.zyt.gestischool.entity.Eleve;
import pashwamroo.zyt.gestischool.service.EleveService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class EleveRestController {

	private final EleveService eleveService;
	private final EleveDao eleveDao;

	public EleveRestController(EleveService eleveService, EleveDao eleveDao) {
		this.eleveService = eleveService;
		this.eleveDao = eleveDao;
	}

	// Avoir tous les eleves
	@GetMapping("/eleves")
	public ResponseEntity<List<Eleve>> avoirTousLesEleves() {

		try {
			List<Eleve> eleves = new ArrayList<>();
			eleves = eleveService.tousLesEleves();
			if (eleves.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(eleves, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	// Avoir un seul eleve par son Id
	@GetMapping("/eleve/{id}")
	public ResponseEntity<Eleve> avoirUnEleve(@PathVariable("id") long id) {
		Optional<Eleve> lEleve = Optional.of(eleveService.obtenirUnEleveParId(id));

		if (lEleve.isPresent()) {
			return new ResponseEntity<>(lEleve.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Créer un eleve
	@PostMapping("/eleves")
	public ResponseEntity<Eleve> creerUnEleve(@RequestBody EleveRepresentation eleveRep) {
		try {
			Eleve nouvelEleve = new Eleve();
			if (!eleveDao.existsById(eleveRep.getId())) {
				nouvelEleve = eleveService.creerEleve(eleveRep);
			}
			return new ResponseEntity<>(nouvelEleve, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Mettre à jour un eleve
	@PutMapping("/eleves/{id}")
	public ResponseEntity<Eleve> mettreAjourUnEleve(@PathVariable("id") long id,
			@RequestBody EleveRepresentation eleveRep) {
		try {
			Eleve eleveCourant = eleveDao.findById(id).orElseThrow(RuntimeException::new);
			eleveCourant.setNom(eleveRep.getNom());
			eleveCourant.setPrenom(eleveRep.getPrenom());
			eleveCourant.setEmail(eleveRep.getEmail());
			eleveCourant.setDateNaissance(eleveRep.getDateNaissance());
			eleveCourant.setUrlImage(eleveRep.getUrlImage());
			eleveCourant = eleveService.creerEleve(eleveRep);

			return new ResponseEntity<>(eleveCourant, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> supprimerUnEleve(@PathVariable("id") Long id) {

		try {
			eleveService.supprimerUnEleve(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
