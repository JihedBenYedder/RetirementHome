package com.idprocess.transport.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idprocess.transport.services.UserService;

/**
 * 
 * User Service
 *
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {
	
	
	public boolean isLogged(String login, String mp){
		
		return true; //userDao.isLogged(login, mp);
	}
	
	
}
