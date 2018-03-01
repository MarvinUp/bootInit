package cn.wtc.edu.bootInit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.wtc.edu.bootInit.domain.User;

public interface UserDao extends JpaRepository<User, Long>{
	  User findByUserName(String userName);
	  User findByUserNameOrEmail(String username, String email);
}
