package pashwamroo.zyt.gestischool.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pashwamroo.zyt.gestischool.dto.ClasseRepresentation;
import pashwamroo.zyt.gestischool.entity.Classe;
import pashwamroo.zyt.gestischool.service.ClasseService;

@Service
@Transactional
public class ClasseServiceImpl implements ClasseService {

	@Override
	public List<Classe> toutesLesClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classe obtenirUneClasseParId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classe creerUneClasse(ClasseRepresentation classeRep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classe mettreAJourUneClasse(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classe supprimerUneClasse(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
