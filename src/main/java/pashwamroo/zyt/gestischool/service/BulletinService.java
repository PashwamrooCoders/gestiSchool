package pashwamroo.zyt.gestischool.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pashwamroo.zyt.gestischool.dao.EleveDao;
import pashwamroo.zyt.gestischool.dao.NoteDao;
import pashwamroo.zyt.gestischool.entity.Bulletin;
import pashwamroo.zyt.gestischool.entity.Eleve;
import pashwamroo.zyt.gestischool.entity.Note;
import pashwamroo.zyt.gestischool.exceptions.EleveNotFoundException;

@Service
@Transactional
public class BulletinService {

	// Injectez un repository ou un service pour accéder aux données des élèves et
	// des notes
	private EleveDao eleveDao;
	private NoteDao noteDao;

	// Constructeur avec injection de dépendance

	public Bulletin generateBulletin(Long eleveId) throws EleveNotFoundException {
		// Récupérez l'élève depuis la base de données
		Eleve eleve = eleveDao.findById(eleveId).orElse(null);

		if (eleve == null) {
			throw new EleveNotFoundException("Élève non trouvé avec l'ID : " + eleveId);
		}

		// Récupérez toutes les notes de l'élève
		List<Note> notes = noteDao.findByEleve(eleve);

		// Calculez la moyenne de l'élève
		double moyenne = calculateMoyenne(notes);

		// Créez un objet Bulletin avec les informations nécessaires
		Bulletin bulletin = new Bulletin();
		bulletin.setEleve(eleve);
		bulletin.setNotes(notes);
		bulletin.setMoyenne(moyenne);
		bulletin.setDecision("Une decision Favorable");

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
}