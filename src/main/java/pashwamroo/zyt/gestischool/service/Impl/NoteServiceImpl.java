package pashwamroo.zyt.gestischool.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pashwamroo.zyt.gestischool.dto.NoteRepresentation;
import pashwamroo.zyt.gestischool.entity.Note;
import pashwamroo.zyt.gestischool.service.NoteService;

@Service
@Transactional
public class NoteServiceImpl implements NoteService{

	@Override
	public List<Note> toutesLesNotes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note obtenirUneNoteParId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note creerUneNote(NoteRepresentation noteRep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note mettreAJourNote(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note supprimerUneNote(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
