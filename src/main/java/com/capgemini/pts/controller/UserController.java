package com.capgemini.pts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pts.entity.Users;
import com.capgemini.pts.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/registerNewUser")
	public Users registerNewUser(@RequestBody Users user) {
		return userService.registerNewUser(user);
	}

}
