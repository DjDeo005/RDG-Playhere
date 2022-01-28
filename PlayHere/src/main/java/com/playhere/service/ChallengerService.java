package com.playhere.service;

import java.util.List;

import com.playhere.beans.Challenger;


public interface ChallengerService {

	void addChallenge(Challenger c);

	List<Challenger> getChallenge();

	

}
