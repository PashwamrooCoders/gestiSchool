package pashwamroo.zyt.gestischool.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Bulletin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	private double moyenne;
	private String decision;

	@ManyToOne
	@JoinColumn(name = "eleve_id")
	private Eleve eleve;
	@OneToMany
	private List<Note> notes;

	@ManyToOne
	@JoinColumn(name = "classe_id")
	private Classe classe;

	@OneToMany(mappedBy = "bulletin")
	private List<Matiere> matieres;

	public Eleve getEleve() {
		return eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
