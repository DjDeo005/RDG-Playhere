package com.playhere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.playhere.beans.PlayerFinder;
import com.playhere.beans.TimeSlot;
import com.playhere.dao.PlayerFinderDao;

@Service
public class PlayerFinderServiceImpl implements PlayerFinderService{

	@Autowired
	PlayerFinderDao playerFinderDao;

	@Override
	public List<com.playhere.beans.PlayerFinder> displayAll() {
		return playerFinderDao.findAll();
	}

	@Override
	public void addPlayerFinder(PlayerFinder p) {
		 playerFinderDao.save(p);
	}



//	@Override
//	public void addPlayerFinder(PlayerFinder p) {
//		playerFinderDao.save(p);
//		
//	}

//	@Override
//	public PlayerFinder getById(long id) {
//		return playerFinderDao.getById(id);
//		
//	}



	
	


}
