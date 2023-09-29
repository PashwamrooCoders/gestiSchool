package pashwamroo.zyt.gestischool.service;

import java.util.List;

import pashwamroo.zyt.gestischool.dto.EcoleRepresentation;
import pashwamroo.zyt.gestischool.entity.Ecole;

public interface EcoleService {

	public List<Ecole> toutesLesEcoles();

	public Ecole obtenirUnEcoleParId(Long id);

	public Ecole creerUneEcole(EcoleRepresentation ecoleRep);

	public Ecole mettreAJourUnEcole(Long id);

	public Ecole supprimerUneEcole(Long id);

}
