package pashwamroo.zyt.gestischool.dto;

public class MatiereRepresentation {
	private Long id;
	private String libelle;
	private Integer coefficient;

	public MatiereRepresentation(Long id, String libelle, Integer coefficient) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.coefficient = coefficient;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}

}
