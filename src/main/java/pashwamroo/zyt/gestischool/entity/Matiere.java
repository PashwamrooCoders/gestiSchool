package pashwamroo.zyt.gestischool.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Matiere {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private Integer coefficient;

	@ManyToOne
	@JoinColumn(name = "bulletin_id")
	private Bulletin bulletin;

	@OneToMany(mappedBy = "matiere")
	private List<Note> notes;

	public Bulletin getBulletin() {
		return bulletin;
	}

	public void setBulletin(Bulletin bulletin) {
		this.bulletin = bulletin;
	}
}
