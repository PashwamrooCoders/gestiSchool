package pashwamroo.zyt.gestischool.service;

import java.util.List;

import pashwamroo.zyt.gestischool.dto.NoteRepresentation;
import pashwamroo.zyt.gestischool.entity.Note;

public interface NoteService {

	public List<Note> toutesLesNotes();

	public Note obtenirUneNoteParId(Long id);

	public Note creerUneNote(NoteRepresentation noteRep);

	public Note mettreAJourNote(Long id);

	public Note supprimerUneNote(Long id);

}
