package com.nim.solutions.ezpark.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nim.solutions.ezpark.dao.UserDao;
import com.nim.solutions.ezpark.model.User;
import com.nim.solutions.ezpark.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByLoginId(String loginId) {
		return userDao.findByLoginId(loginId);
	}

	@Override
	public boolean createNewUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
