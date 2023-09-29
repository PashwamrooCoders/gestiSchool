package pashwamroo.zyt.gestischool.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pashwamroo.zyt.gestischool.dto.EcoleRepresentation;
import pashwamroo.zyt.gestischool.entity.Ecole;
import pashwamroo.zyt.gestischool.service.EcoleService;

@Service
@Transactional
public class EcoleServiceImpl implements EcoleService {

	@Override
	public List<Ecole> toutesLesEcoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecole obtenirUnEcoleParId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecole creerUneEcole(EcoleRepresentation ecoleRep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecole mettreAJourUnEcole(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecole supprimerUneEcole(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
