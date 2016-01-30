package com.poc.service;

import java.util.HashMap;
import com.poc.model.Users;

public interface UserService {
	public void add(Users user);
	public void edit(Users user);
	public void delete(int userID);
	public HashMap<String, Object> getAllUsers();
}
