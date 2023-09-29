package pashwamroo.zyt.gestischool.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pashwamroo.zyt.gestischool.dao.BulletinDao;
import pashwamroo.zyt.gestischool.dao.EleveDao;
import pashwamroo.zyt.gestischool.dao.NoteDao;
import pashwamroo.zyt.gestischool.dto.BulletinRepresentation;
import pashwamroo.zyt.gestischool.entity.Bulletin;
import pashwamroo.zyt.gestischool.entity.Eleve;
import pashwamroo.zyt.gestischool.entity.Note;
import pashwamroo.zyt.gestischool.exceptions.EleveNotFoundException;
import pashwamroo.zyt.gestischool.exceptions.NoteNotFoundException;
import pashwamroo.zyt.gestischool.service.BulletinService;

@Service
@Transactional
public class BulletinServiceImpl implements BulletinService {

	// Injectez un repository ou un service pour accéder aux données des élèves et
	// des notes
	private EleveDao eleveDao;
	private NoteDao noteDao;
	private BulletinDao bulletinDao;

	// Constructeur avec injection de dépendance

	public BulletinServiceImpl(EleveDao eleveDao, NoteDao noteDao, BulletinDao bulletinDao) {
		this.eleveDao = eleveDao;
		this.noteDao = noteDao;
		this.bulletinDao = bulletinDao;
	}

	public Bulletin genererLeBulletinDUnEleve(Long eleveId) throws EleveNotFoundException, NoteNotFoundException {
		// Récupérez l'élève depuis la base de données
		Eleve eleve = eleveDao.findById(eleveId).orElse(null);

		if (eleve == null) {
			throw new EleveNotFoundException("Élève non trouvé avec l'ID : " + eleveId);
		}

		// Récupérez toutes les notes de l'élève

		List<Note> notes = noteDao.findByEleve(eleve);
		if (notes.isEmpty()) {
			throw new NoteNotFoundException("Notes non trouvé avec l'ID : ");
		}

		// Calculez la moyenne de l'élève
		double moyenne = calculateMoyenne(notes);

		// Créez un objet Bulletin avec les informations nécessaires
		Bulletin bulletin = new Bulletin();
		bulletin.setEleve(eleve);
		bulletin.setNotes(notes);
		bulletin.setMoyenne(moyenne);
		bulletin.setDecision("Une decision Favorable");
		bulletin.setNumeroTrimestre("1er trimestre");
		bulletin.setAnneeScolaire("2022/2023");

		return bulletin;
	}

	private double calculateMoyenne(List<Note> notes) {
		double laMoyenne = 0;
		double somme = 0;
		for (Note note : notes) {
			somme += note.getValeur();
		}
		laMoyenne = somme / notes.size();
		return laMoyenne;
	}

	@Override
	public List<Bulletin> tousLesBulletins() {

		return bulletinDao.findAll();
	}

	@Override
	public Bulletin obtenirUnBulletinParId(Long id) {

		return bulletinDao.findById(id).orElse(null);
	}

	@Override
	public Bulletin creerUneBulletin(BulletinRepresentation bulletinRep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bulletin mettreAJourBulletin(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bulletin supprimerUnBulletin(Long id) {

		Bulletin bulletin = obtenirUnBulletinParId(id);
		bulletinDao.deleteById(id);
		return bulletin;
	}
}