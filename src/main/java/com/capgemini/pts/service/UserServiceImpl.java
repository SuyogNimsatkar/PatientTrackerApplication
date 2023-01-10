package com.capgemini.pts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pts.entity.Users;
import com.capgemini.pts.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public Users registerNewUser(Users user) {
		return userRepo.save(user);
	}

}
