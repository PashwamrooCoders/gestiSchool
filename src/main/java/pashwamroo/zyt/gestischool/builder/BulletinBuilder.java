package pashwamroo.zyt.gestischool.builder;

import pashwamroo.zyt.gestischool.entity.Bulletin;

public class BulletinBuilder {

	private Long id;
	private double moyenne;
	private String decision;
	private String numeroTrimestre;
	private String anneeScolaire;

	public Long getId() {
		return id;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public String getDecision() {
		return decision;
	}

	public String getNumeroTrimestre() {
		return numeroTrimestre;
	}

	public String getAnneeScolaire() {
		return anneeScolaire;
	}

	public BulletinBuilder withId(Long id) {
		this.id = id;
		return this;
	}

	public BulletinBuilder withMoyenne(double moyenne) {
		this.moyenne = moyenne;
		return this;
	}

	public BulletinBuilder withDecision(String decision) {
		this.decision = decision;
		return this;
	}

	public BulletinBuilder withNumeroTrimestre(String numeroTrimestre) {
		this.numeroTrimestre = numeroTrimestre;
		return this;
	}

	public BulletinBuilder withAnneeScolaire(String anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
		return this;
	}

	public Bulletin build() {
		Bulletin bulletin = new Bulletin();
		id = bulletin.getId();
		moyenne = bulletin.getMoyenne();
		decision = bulletin.getDecision();
		numeroTrimestre = bulletin.getNumeroTrimestre();
		anneeScolaire = bulletin.getAnneeScolaire();
		return bulletin;
	}

}
