package com.ykyclm.service;

import com.ykyclm.entity.User;

public interface UserService {
	
	public User findUserByEmail(String email);
	
	public void saveUser(User user);

}
