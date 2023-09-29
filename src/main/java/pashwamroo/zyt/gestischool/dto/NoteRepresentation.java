package pashwamroo.zyt.gestischool.dto;

public class NoteRepresentation {

	private Long id;
	private double valeur;
	private String appreciation;

	public NoteRepresentation(Long id, double valeur, String appreciation) {
		super();
		this.id = id;
		this.valeur = valeur;
		this.appreciation = appreciation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public String getAppreciation() {
		return appreciation;
	}

	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}

}
