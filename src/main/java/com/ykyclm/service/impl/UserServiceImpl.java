package com.ykyclm.service.impl;

import java.util.List;
import java.util.Set;

import com.ykyclm.entity.Player;
import com.ykyclm.entity.Role;
import com.ykyclm.entity.Team;
import com.ykyclm.entity.User;
import com.ykyclm.repository.PlayerRepository;
import com.ykyclm.repository.RoleRespository;
import com.ykyclm.repository.TeamRepository;
import com.ykyclm.repository.UserRepository;
import com.ykyclm.service.PlayerService;
import com.ykyclm.service.TeamService;
import com.ykyclm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	 
	@Autowired
	private RoleRespository roleRespository;
	 
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	 
	@Override
	public User findUserByEmail(String email) {
		
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setActive(1);
		
		Role userRole = roleRespository.findByRole("ADMIN");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		
		userRepository.save(user);	
	}

	
		

}
