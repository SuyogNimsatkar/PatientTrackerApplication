package com.capgemini.pts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pts.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String>{

}
