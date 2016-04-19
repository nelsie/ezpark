package com.nim.solutions.ezpark.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nim.solutions.ezpark.model.User;

public interface UserDao extends JpaRepository<User, Integer> {
	public User findByLoginId(String loginId);
}
