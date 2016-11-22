package com.idprocess.transport.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.idprocess.transport.model.Utilisateur;
import com.idprocess.transport.persistence.repository.UserRepository;
import com.idprocess.transport.services.LoginService;

/**
 * @author oussama
 *
 */

public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserRepository userRepository;
	
	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	public UserDetails loadUserByUsername(String login)
			throws UsernameNotFoundException {

		Utilisateur processUser = userRepository.findUserByLogin(login);

		if (processUser == null) {
			throw new UsernameNotFoundException("User not found: " + login);
		}
		
		org.springframework.security.core.userdetails.User user = new org.springframework.security.core.userdetails.User(
				processUser.getLogin() , processUser.getPassword() , true ,  
				true,
				true,
				true,
				makeGrantedAuthorities(processUser));

		return user;
	}


	private List<GrantedAuthority> makeGrantedAuthorities(Utilisateur siwelUser) {
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
		authList.add(new SimpleGrantedAuthority("ROLE_USER"));
		return authList;
	}
}
