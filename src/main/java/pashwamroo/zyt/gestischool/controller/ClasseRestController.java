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

import pashwamroo.zyt.gestischool.dao.ClasseDao;
import pashwamroo.zyt.gestischool.dto.ClasseRepresentation;
import pashwamroo.zyt.gestischool.entity.Classe;
import pashwamroo.zyt.gestischool.service.ClasseService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class ClasseRestController {

	private final ClasseService classeService;
	private final ClasseDao classeDao;

	public ClasseRestController(ClasseService classeService, ClasseDao classeDao) {
		this.classeService = classeService;
		this.classeDao = classeDao;
	}

	// Avoir toutes les classes
	@GetMapping("/classes")
	public ResponseEntity<List<Classe>> avoirToutesLesClasses() {

		try {
			List<Classe> classes = new ArrayList<>();
			classes = classeService.toutesLesClasses();
			if (classes.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(classes, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	// Avoir une seule classe par son Id
	@GetMapping("/classe/{id}")
	public ResponseEntity<Classe> avoirUneClasse(@PathVariable("id") long id) {
		Optional<Classe> laClasse = Optional.of(classeService.obtenirUneClasseParId(id));

		if (laClasse.isPresent()) {
			return new ResponseEntity<>(laClasse.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Créer une classe
	@PostMapping("/classes")
	public ResponseEntity<Classe> creerUneClasse(@RequestBody ClasseRepresentation classeRep) {
		try {
			Classe nouvelleClasse = new Classe();
			if (!classeDao.existsById(classeRep.getId())) {
				nouvelleClasse = classeService.creerUneClasse(classeRep);
			}
			return new ResponseEntity<>(nouvelleClasse, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Mettre à jour une classe
	@PutMapping("/classes/{id}")
	public ResponseEntity<Classe> mettreAjourUneClasse(@PathVariable("id") long id,
			@RequestBody ClasseRepresentation classeRep) {
		try {
			Classe classeCourante = classeDao.findById(id).orElseThrow(RuntimeException::new);
			classeCourante.setNom(classeRep.getNom());
			classeCourante.setEffectif(classeRep.getEffectif());

			return new ResponseEntity<>(classeCourante, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/suppclasse/{id}")
	public ResponseEntity<HttpStatus> supprimerUneClasse(@PathVariable("id") Long id) {

		try {
			classeService.supprimerUneClasse(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
