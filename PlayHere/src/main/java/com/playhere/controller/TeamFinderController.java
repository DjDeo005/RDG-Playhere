package com.playhere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.TeamFinder;
import com.playhere.service.TeamFinderService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/teamfinder/")
public class TeamFinderController {

	@Autowired
	TeamFinderService teamFinderService;
	
	@PostMapping("/post")
	public void addPost(@RequestBody TeamFinder team) {
		teamFinderService.addPost(team);
	}
	
	@GetMapping("/get")
	public List<TeamFinder> displayAllReq(){
		return teamFinderService.displayAll();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<TeamFinder> getById(@PathVariable(name = "id") long id){
		TeamFinder teamFinder = teamFinderService.displayById(id);
		//if(teamFinder!=null) {
		System.out.println(teamFinder);
			return new ResponseEntity<>(teamFinder, HttpStatus.OK);

		//}

		//return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	
}
