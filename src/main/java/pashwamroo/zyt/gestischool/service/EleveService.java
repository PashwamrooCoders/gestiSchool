package pashwamroo.zyt.gestischool.service;

import java.util.List;

import pashwamroo.zyt.gestischool.dto.EleveRepresentation;
import pashwamroo.zyt.gestischool.entity.Eleve;

public interface EleveService {

	public List<Eleve> tousLesEleves();

	public Eleve obtenirUnEleveParId(Long id);

	public Eleve creerUnEleve(EleveRepresentation eleveRep);

	public Eleve mettreAJourUnEleve(Long id);

	public Eleve supprimerUnEleve(Long id);

}
