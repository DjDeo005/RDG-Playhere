package com.playhere.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.playhere.beans.TeamFinder;

public interface TeamFinderService {

	void addPost(TeamFinder team);

	List<TeamFinder> displayAll();

	TeamFinder displayById(long id);

	

	

	

}
