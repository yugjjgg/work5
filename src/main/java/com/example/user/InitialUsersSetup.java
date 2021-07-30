package com.example.user;

import java.util.Arrays;
import java.util.Collection;

import com.example.user.persistence.entity.AuthorityEntity;
import com.example.user.persistence.entity.RoleEntity;
import com.example.user.persistence.entity.UserEntity;
import com.example.user.persistence.repository.AuthorityRepository;
import com.example.user.persistence.repository.RoleRepository;
import com.example.user.persistence.repository.UserRepository;
import com.example.user.shared.Roles;
import com.example.user.shared.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class InitialUsersSetup {
	
	@Autowired
	AuthorityRepository authorityRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired 
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	Utils utils;
	
	@Autowired
	UserRepository userRepository;

	@EventListener
	@Transactional
	public void onApplicationEvent(ApplicationReadyEvent event) {


	}


}
