package com.playhere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.TimeSlot;
import com.playhere.service.TimeSlotService;

@RestController
@RequestMapping("/time/")
public class TimeSlotController {

	@Autowired
	TimeSlotService timeSlotService;
	
	@PostMapping("/timeslot")
	public ResponseEntity<TimeSlot> addTimeSlot(@RequestBody TimeSlot t){
		timeSlotService.addTimeSlot(t);
		return null;
		
		 
	}
	
	@GetMapping("/gettimeslot")
	public List<TimeSlot> displayAll(){
		return timeSlotService.findAll();
	}
		
}
