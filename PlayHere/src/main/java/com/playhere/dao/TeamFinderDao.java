package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playhere.beans.TeamFinder;

public interface TeamFinderDao extends JpaRepository<TeamFinder, Long> {

}
