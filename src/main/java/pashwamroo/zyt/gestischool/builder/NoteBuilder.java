package pashwamroo.zyt.gestischool.builder;

import pashwamroo.zyt.gestischool.dto.NoteRepresentation;
import pashwamroo.zyt.gestischool.entity.Note;

public class NoteBuilder {

	private Long id;
	private double valeur;
	private String appreciation;

	public NoteBuilder fromNoteRepresentation(NoteRepresentation noteRep) {
		id = noteRep.getId();
		valeur = noteRep.getValeur();
		appreciation = noteRep.getAppreciation();
		return this;
	}

	public Long getId() {
		return id;
	}

	public double getValeur() {
		return valeur;
	}

	public String getAppreciation() {
		return appreciation;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}

	public Note build() {
		Note note = new Note();
		id = note.getId();
		valeur = note.getValeur();
		appreciation = note.getAppreciation();
		return note;
	}

}
