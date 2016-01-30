package com.poc.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.poc.dao.UserDao;
import com.poc.model.Users;
@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory session;
	@Override
	public void add(Users user) {
		session.getCurrentSession().save(user);
	}

	@Override
	public void edit(Users user) {
		session.getCurrentSession().update(user);
	}

	@Override
	public void delete(int userID) {
		Query qry=session.getCurrentSession().createQuery("Delete from Users where userId="+userID);
		qry.executeUpdate();
	}

	@Override
	public HashMap<String, Object> getAllUsers() {
		HashMap<String, Object> mapReturn = new HashMap<String, Object>();
		List<Users> users = (List<Users>)session.getCurrentSession().createQuery("from Users").list();
		mapReturn.put("users",users );
		return mapReturn;
	}

}
