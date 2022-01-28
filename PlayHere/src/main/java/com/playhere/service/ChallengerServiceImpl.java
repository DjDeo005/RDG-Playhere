package com.playhere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playhere.beans.Challenger;
import com.playhere.dao.ChallengerDao;

@Service
public class ChallengerServiceImpl implements ChallengerService {

	@Autowired
	ChallengerDao challengerDao;

	@Override
	public void addChallenge(Challenger c) {
		challengerDao.save(c);
		
	}

	@Override
	public List<Challenger> getChallenge() {
		return challengerDao.findAll();
	}
	
	

	
}
