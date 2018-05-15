package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.model.UserProfile;

@Repository
public interface UserRepository extends JpaRepository<UserProfile, String>{

}
