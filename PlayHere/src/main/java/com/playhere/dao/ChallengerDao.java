package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playhere.beans.Challenger;

public interface ChallengerDao extends JpaRepository<Challenger, Long> {

}
