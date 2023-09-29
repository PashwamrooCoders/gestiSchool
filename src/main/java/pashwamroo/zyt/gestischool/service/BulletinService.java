package pashwamroo.zyt.gestischool.service;

import java.util.List;

import pashwamroo.zyt.gestischool.dto.BulletinRepresentation;
import pashwamroo.zyt.gestischool.entity.Bulletin;
import pashwamroo.zyt.gestischool.exceptions.EleveNotFoundException;

public interface BulletinService {
	
	public List<Bulletin> tousLesBulletins();
	public Bulletin genererLeBulletinDUnEleve(Long eleveId) throws EleveNotFoundException;

	public Bulletin obtenirUnBulletinParId(Long id);

	public Bulletin creerUneBulletin(BulletinRepresentation bulletinRep);

	public Bulletin mettreAJourBulletin(Long id);

	public Bulletin supprimerUnBulletin(Long id);

}
