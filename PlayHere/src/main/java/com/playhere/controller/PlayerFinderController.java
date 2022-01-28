package com.playhere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.PlayerFinder;
import com.playhere.service.PlayerFinderService;


@RestController
@RequestMapping("/playerfinder/")
public class PlayerFinderController {

	@Autowired
	PlayerFinderService playerFinder;
	
	@GetMapping("/findall")
	public List<PlayerFinder> displayAll(){
		return playerFinder.displayAll();
	}
	
	@PostMapping("/postplayer")
	public void addPlayer(@RequestBody PlayerFinder p){
		 playerFinder.addPlayerFinder(p);

				
	}
	
	
	
}
