package com.nim.solutions.ezpark.service;

import com.nim.solutions.ezpark.model.User;

public interface UserService {
	public User getUserByLoginId(String loginId);
	
	public boolean createNewUser(User user);
	
}
