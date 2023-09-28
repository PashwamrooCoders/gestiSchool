package pashwamroo.zyt.gestischool.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pashwamroo.zyt.gestischool.builder.EleveBuilder;
import pashwamroo.zyt.gestischool.dao.EleveDao;
import pashwamroo.zyt.gestischool.dto.EleveRepresentation;
import pashwamroo.zyt.gestischool.entity.Eleve;

@Service
@Transactional
public class EleveService {

	private EleveDao eleveDao;

	public EleveService(EleveDao eleveDao) {
		this.eleveDao = eleveDao;
	}

	private EleveRepresentation toDto(Eleve eleve) {
		return new EleveRepresentation(eleve.getId(), eleve.getNom(), eleve.getPrenom(), eleve.getEmail(),
				eleve.getDateNaissance(), eleve.getUrlImage());
	}

	public List<Eleve> tousLesEleves() {
		return eleveDao.findAll();
	}

	public Eleve obtenirUnEleveParId(Long id) {
		return eleveDao.findById(id).orElse(null);
	}

	public Eleve creerEleve(EleveRepresentation eleveRep) {
		EleveBuilder builderEleve = new EleveBuilder();
		Eleve eleve = builderEleve.fromEleveRePresentation(eleveRep).build();
		return eleveDao.save(eleve);
	}

	public Eleve mettreAJourEleve(Long id) {
		Eleve eleve = obtenirUnEleveParId(id);
		return eleveDao.save(eleve);
	}

	public Eleve supprimerUnEleve(Long id) {
		Eleve eleve = obtenirUnEleveParId(id);
		eleveDao.deleteById(id);
		return eleve;
	}

}
