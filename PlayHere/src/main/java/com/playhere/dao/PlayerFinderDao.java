package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playhere.beans.PlayerFinder;

public interface PlayerFinderDao extends JpaRepository<PlayerFinder, Long>{

}
