package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playhere.beans.Ground;
import com.playhere.beans.Newground;

public interface GroundDao extends JpaRepository<Newground, Long>{
	
}
