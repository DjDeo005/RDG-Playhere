package com.playhere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.Users;
import com.playhere.service.UserSignupService;
import com.playhere.service.UserSignupServiceImpl;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/auth/")
public class UserSignupController {
	
	@Autowired
	UserSignupService userSignupService;

	
	@PostMapping("/signup")
	public ResponseEntity<Users> addUsers(@RequestBody Users u) {
		userSignupService.addUsers(u);
		Users u1=userSignupService.getById(u.getId());
		if(u1!=null)
			return ResponseEntity.ok(u1);
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		
	}
	
	@GetMapping("/login")
	public ResponseEntity<String> login(@RequestParam String email , @RequestParam String pass){
			
		if(userSignupService.validateUser(email, pass))
			//login successful flow
			return ResponseEntity.ok("Sucess");
		else
			//login failed flow
			return ResponseEntity.ok("Login failed");
	}
	
		
}
