package pashwamroo.zyt.gestischool.dto;

public class BulletinRepresentation {

	private Long id;
	private double moyenne;
	private String decision;
	private String numeroTrimestre;
	private String anneeScolaire;

	public BulletinRepresentation(Long id, double moyenne, String decision, String numeroTrimestre,
			String anneeScolaire) {
		super();
		this.id = id;
		this.moyenne = moyenne;
		this.decision = decision;
		this.numeroTrimestre = numeroTrimestre;
		this.anneeScolaire = anneeScolaire;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public String getNumeroTrimestre() {
		return numeroTrimestre;
	}

	public void setNumeroTrimestre(String numeroTrimestre) {
		this.numeroTrimestre = numeroTrimestre;
	}

	public String getAnneeScolaire() {
		return anneeScolaire;
	}

	public void setAnneeScolaire(String anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

}
