package pashwamroo.zyt.gestischool.builder;

import pashwamroo.zyt.gestischool.dto.ClasseRepresentation;
import pashwamroo.zyt.gestischool.entity.Classe;

public class ClasseBuilder {

	private Long id;
	private String nom;
	private int effectif;

	public ClasseBuilder fromClasseRepresentation(ClasseRepresentation classeRep) {

		id = classeRep.getId();
		nom = classeRep.getNom();
		effectif = classeRep.getEffectif();
		return this;
	}

	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public int getEffectif() {
		return effectif;
	}

	public ClasseBuilder withId(Long id) {
		this.id = id;
		return this;
	}

	public ClasseBuilder withNom(String nom) {
		this.nom = nom;
		return this;
	}

	public ClasseBuilder setEffectif(int effectif) {
		this.effectif = effectif;
		return this;
	}

	public Classe build() {
		Classe classe = new Classe();
		id = classe.getId();
		nom = classe.getNom();
		effectif = classe.getEffectif();
		return classe;
	}

}
