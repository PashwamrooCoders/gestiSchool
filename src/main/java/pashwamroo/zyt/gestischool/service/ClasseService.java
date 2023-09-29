package pashwamroo.zyt.gestischool.service;

import java.util.List;

import pashwamroo.zyt.gestischool.dto.ClasseRepresentation;
import pashwamroo.zyt.gestischool.entity.Classe;

public interface ClasseService {

	public List<Classe> toutesLesClasses();

	public Classe obtenirUneClasseParId(Long id);

	public Classe creerUneClasse(ClasseRepresentation classeRep);

	public Classe mettreAJourUneClasse(Long id);

	public Classe supprimerUneClasse(Long id);

}
