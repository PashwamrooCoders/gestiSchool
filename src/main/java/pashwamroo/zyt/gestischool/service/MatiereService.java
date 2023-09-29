package pashwamroo.zyt.gestischool.service;

import java.util.List;

import pashwamroo.zyt.gestischool.dto.MatiereRepresentation;
import pashwamroo.zyt.gestischool.entity.Matiere;

public interface MatiereService {

	public List<Matiere> toutesLesMatieres();

	public Matiere obtenirUneMatiereParId(Long id);

	public Matiere creerUneMatiere(MatiereRepresentation matiereRep);

	public Matiere mettreAJourUneMatiere(Long id);

	public Matiere supprimerUneMatiere(Long id);

}
