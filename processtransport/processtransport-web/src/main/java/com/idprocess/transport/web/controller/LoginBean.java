package com.idprocess.transport.web.controller;

import javax.faces.bean.RequestScoped;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.idprocess.transport.model.Utilisateur;
import com.idprocess.transport.services.UserService;

/**
 * Login Manager Bean
 * @author Anis
 *
 */

@RequestScoped
@Component("logBean")
@Data
public class LoginBean {
	
	@Autowired
	UserService userService;
	
	@Getter
	@Setter
	Utilisateur u = new Utilisateur();
	
	private String username;  
    private String password;
    private String email;
	
	public boolean isLogged(String login, String mp) {
		return userService.isLogged(login, mp);
	}
      
    public String login() {  
        boolean loggedIn = false;           
        if(username != null  && username.equals("admin") && password != null  && password.equals("admin")) {  
            loggedIn = true;  
            return "loginOK";
        } else {  
            loggedIn = false; 
            return "loginNOTOK";            
        }  
                  
        //System.out.println("loggedIn="+loggedIn);
    }
	
	
}
