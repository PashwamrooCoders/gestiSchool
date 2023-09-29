package pashwamroo.zyt.gestischool.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import pashwamroo.zyt.gestischool.entity.User;

public interface UserDao extends JpaRepository<User,Long> {

}
