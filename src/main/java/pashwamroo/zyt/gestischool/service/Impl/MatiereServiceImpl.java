package pashwamroo.zyt.gestischool.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pashwamroo.zyt.gestischool.dto.MatiereRepresentation;
import pashwamroo.zyt.gestischool.entity.Matiere;
import pashwamroo.zyt.gestischool.service.MatiereService;

@Service
@Transactional
public class MatiereServiceImpl implements MatiereService {

	@Override
	public List<Matiere> toutesLesMatieres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matiere obtenirUneMatiereParId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matiere creerUneMatiere(MatiereRepresentation matiereRep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matiere mettreAJourUneMatiere(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matiere supprimerUneMatiere(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
