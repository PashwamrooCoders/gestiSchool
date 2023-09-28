package pashwamroo.zyt.gestischool.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pashwamroo.zyt.gestischool.entity.Eleve;
import pashwamroo.zyt.gestischool.entity.Note;

import java.util.List;

public interface NoteDao extends JpaRepository<Note,Long> {

    List<Note> findByEleve(Eleve eleve);
}
