package pashwamroo.zyt.gestischool.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pashwamroo.zyt.gestischool.entity.Bulletin;

public interface BulletinDao extends JpaRepository<Bulletin,Long> {
}
