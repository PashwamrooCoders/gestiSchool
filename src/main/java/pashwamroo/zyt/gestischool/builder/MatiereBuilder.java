package pashwamroo.zyt.gestischool.builder;

import pashwamroo.zyt.gestischool.dto.MatiereRepresentation;
import pashwamroo.zyt.gestischool.entity.Matiere;

public class MatiereBuilder {

	private Long id;
	private String libelle;
	private Integer coefficient;

	public MatiereBuilder fromMatiereRepresentation(MatiereRepresentation matRep) {

		id = matRep.getId();
		libelle = matRep.getLibelle();
		coefficient = matRep.getCoefficient();
		return this;

	}

	public Long getId() {
		return id;
	}

	public String getLibelle() {
		return libelle;
	}

	public Integer getCoefficient() {
		return coefficient;
	}

	public MatiereBuilder withId(Long id) {
		this.id = id;
		return this;
	}

	public MatiereBuilder withLibelle(String libelle) {
		this.libelle = libelle;
		return this;
	}

	public MatiereBuilder withCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
		return this;
	}

	public Matiere build() {
		Matiere matiere = new Matiere();
		id = matiere.getId();
		libelle = matiere.getLibelle();
		coefficient = matiere.getCoefficient();

		return matiere;
	}

}
