package pashwamroo.zyt.gestischool.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pashwamroo.zyt.gestischool.entity.Eleve;

public interface EleveDao extends JpaRepository<Eleve,Long> {
}
