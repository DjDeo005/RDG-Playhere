package com.playhere.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.playhere.beans.TeamFinder;
import com.playhere.dao.TeamFinderDao;

@Service
public class TeamFinderServiceImpl implements TeamFinderService{

	@Autowired
	TeamFinderDao teamFinderDao;

	@Override
	public void addPost(TeamFinder team) {
		teamFinderDao.save(team);
		
	}

	@Override
	public List<TeamFinder> displayAll() {
		return teamFinderDao.findAll();
	}

	@Override
	public TeamFinder displayById(long id) {
		System.out.println(id);
		return teamFinderDao.getById(id);
	}

	

	
	
	
}
