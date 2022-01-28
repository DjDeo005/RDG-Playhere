package com.playhere.service;

import com.playhere.beans.Users;

public interface UserSignupService {

	void addUsers(Users u);

	Users getById(long id);

	boolean validateUser(String email, String pass);

}
