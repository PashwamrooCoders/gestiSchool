package pashwamroo.zyt.gestischool.exceptions;

public class NoteNotFoundException extends ClassNotFoundException {

	private String message;

	public NoteNotFoundException(String message) {
		this.message = message;
	}

}
