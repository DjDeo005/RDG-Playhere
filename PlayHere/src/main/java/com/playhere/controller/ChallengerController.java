package com.playhere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.Challenger;
import com.playhere.service.ChallengerService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/challengers")
public class ChallengerController {

	@Autowired
	ChallengerService challengerService;
	
	@PostMapping("/postchallenge")
	public void addChallenge(@RequestBody Challenger c) {
		challengerService.addChallenge(c);
	}
	
	@GetMapping("/getchallenge")
	public List<Challenger> getChallenge() {
		return challengerService.getChallenge();
		
	}
	
	
	
	
	
	
}
