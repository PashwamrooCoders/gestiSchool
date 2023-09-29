package pashwamroo.zyt.gestischool.dto;

public class ClasseRepresentation {
	
	private Long id;
    private String nom;
    private int effectif;
    
	public ClasseRepresentation(Long id, String nom, int effectif) {
		super();
		this.id = id;
		this.nom = nom;
		this.effectif = effectif;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEffectif() {
		return effectif;
	}

	public void setEffectif(int effectif) {
		this.effectif = effectif;
	}
    
    

}
