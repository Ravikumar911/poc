package com.poc.service.impl;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.dao.UserDao;
import com.poc.model.Users;
import com.poc.service.UserService;
import org.springframework.transaction.annotation.Transactional;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void add(Users user) {
		 userDao.add(user);
	}

	@Transactional	
	public void edit(Users user) {
		 userDao.edit(user);
	}

	@Transactional
	public void delete(int userID) {
		 userDao.delete(userID);
	}
	
	@Transactional
	public HashMap<String, Object> getAllUsers() {
		return userDao.getAllUsers();
	}

}
