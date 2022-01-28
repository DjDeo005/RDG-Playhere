package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playhere.beans.Users;

public interface UserSignupDao extends JpaRepository<Users, Long> {

	

}
