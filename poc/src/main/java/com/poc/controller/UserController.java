package com.poc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.poc.model.Users;
import com.poc.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@RequestMapping(value = { "/users-list" })
	public ModelAndView Users() {
		return new ModelAndView("/users-list","map",userService.getAllUsers()) ;
	}
	@RequestMapping(value={"/create"})
	public void createUser(HttpServletRequest request,HttpServletResponse response){
		Users user= new Users();
		user.setFirstName(request.getParameter("firstName"));
		user.setLastName(request.getParameter("lastName"));
		user.setUserEmailId(request.getParameter("emailId"));
		userService.add(user);
		try {
			response.sendRedirect("users-list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value={"/delete"})
	public void deleteUser(HttpServletRequest request,HttpServletResponse response){
		userService.delete(Integer.valueOf(request.getParameter("id")));
		try {
			response.sendRedirect("users-list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value={"/update"})
	public void updateUser(HttpServletRequest request,HttpServletResponse response){
		Users user= new Users();
		user.setUserId(Integer.parseInt(request.getParameter("userId")));
		user.setFirstName(request.getParameter("firstName"));
		user.setLastName(request.getParameter("lastName"));
		user.setUserEmailId(request.getParameter("emailId"));
		userService.edit(user);
		try {
			response.sendRedirect("users-list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value={"/edit"})
	public String editUser(){
		return("edit");
	}
}
