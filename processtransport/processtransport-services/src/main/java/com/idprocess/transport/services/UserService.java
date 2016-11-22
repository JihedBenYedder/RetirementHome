package com.idprocess.transport.services;

import java.util.List;

import com.idprocess.transport.model.*;

/**
 * 
 * User Service Interface
 *
 */
public interface UserService {

	boolean isLogged(String login, String mp);
}
