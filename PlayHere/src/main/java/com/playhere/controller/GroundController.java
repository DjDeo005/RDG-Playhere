package com.playhere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.Ground;
import com.playhere.beans.Newground;
import com.playhere.service.GroundService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/ground")
public class GroundController {
	@Autowired
	GroundService groundService;
	
	@GetMapping("/get")
	public List<Newground> diplayAllgrd(){
		return groundService.displayAll();
	}

	
}
