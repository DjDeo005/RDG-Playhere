package com.playhere.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.playhere.beans.PlayerFinder;
import com.playhere.beans.TimeSlot;


public interface PlayerFinderService {

	List<com.playhere.beans.PlayerFinder> displayAll();

	void addPlayerFinder(PlayerFinder p);

	

//	void addPlayerFinder(PlayerFinder p);
//
//	PlayerFinder getById(long id);

	

}
