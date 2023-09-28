package pashwamroo.zyt.gestischool.builder;

import java.util.Date;

import pashwamroo.zyt.gestischool.dto.EleveRepresentation;
import pashwamroo.zyt.gestischool.entity.Eleve;

public class EleveBuilder {

	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private Date dateNaissance;
	private String urlImage;

	public EleveBuilder fromEleveRePresentation(EleveRepresentation eleveRep) {

		id = eleveRep.getId();
		nom = eleveRep.getNom();
		prenom = eleveRep.getPrenom();
		email = eleveRep.getEmail();
		dateNaissance = eleveRep.getDateNaissance();
		urlImage = eleveRep.getUrlImage();
		return this;
	}

	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getEmail() {
		return email;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EleveBuilder withNom(String nom) {
		this.nom = nom;
		return this;
	}

	public EleveBuilder withPrenom(String prenom) {
		this.prenom = prenom;
		return this;
	}

	public EleveBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public EleveBuilder withDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
		return this;
	}

	public EleveBuilder withUrlImage(String urlImage) {
		this.urlImage = urlImage;
		return this;
	}

	public Eleve build() {

		Eleve eleve = new Eleve();
		id = eleve.getId();
		nom = eleve.getNom();
		prenom = eleve.getPrenom();
		email = eleve.getEmail();
		dateNaissance = eleve.getDateNaissance();
		urlImage = eleve.getUrlImage();

		return eleve;
	}

}
