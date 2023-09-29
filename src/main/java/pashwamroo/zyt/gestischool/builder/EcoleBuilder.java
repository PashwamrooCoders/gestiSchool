package pashwamroo.zyt.gestischool.builder;

import pashwamroo.zyt.gestischool.dto.EcoleRepresentation;
import pashwamroo.zyt.gestischool.entity.Ecole;

public class EcoleBuilder {

	private Long id;
	private String nom;
	private String devise;
	private String urlLogo;

	public EcoleBuilder fromEcoleRepresentation(EcoleRepresentation ecoRep) {

		id = ecoRep.getId();
		nom = ecoRep.getNom();
		devise = ecoRep.getDevise();
		urlLogo = ecoRep.getUrlLogo();
		return this;
	}

	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getDevise() {
		return devise;
	}

	public String getUrlLogo() {
		return urlLogo;
	}

	public EcoleBuilder withId(Long id) {
		this.id = id;
		return this;
	}

	public EcoleBuilder withNom(String nom) {
		this.nom = nom;
		return this;
	}

	public EcoleBuilder withDevise(String devise) {
		this.devise = devise;
		return this;
	}

	public EcoleBuilder withUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
		return this;
	}

	public Ecole build() {
		Ecole ecole = new Ecole();
		id = ecole.getId();
		nom = ecole.getNom();
		devise = ecole.getDevise();
		urlLogo = ecole.getUrlLogo();
		return ecole;
	}

}
