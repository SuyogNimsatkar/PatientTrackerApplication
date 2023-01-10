package com.capgemini.pts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pts.entity.Role;
import com.capgemini.pts.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleRepository roleRepo;

	@Override
	public Role createNewRole(Role role) {
		return roleRepo.save(role);
	}

}
