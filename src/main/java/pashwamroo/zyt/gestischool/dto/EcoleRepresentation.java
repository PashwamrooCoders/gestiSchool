package pashwamroo.zyt.gestischool.dto;

public class EcoleRepresentation {

	private Long id;
	private String nom;
	private String devise;
	private String urlLogo;

	public EcoleRepresentation(Long id, String nom, String devise, String urlLogo) {
		super();
		this.id = id;
		this.nom = nom;
		this.devise = devise;
		this.urlLogo = urlLogo;
	}

	public String getUrlLogo() {
		return urlLogo;
	}

	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
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

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

}
