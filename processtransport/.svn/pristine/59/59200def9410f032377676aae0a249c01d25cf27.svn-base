package com.idprocess.transport.web.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
 
/**
 * L'authentification est gérée par SpringSecurity
 * The Class LoginController.
 * @author Oussama TABBAKH
 */
@Component("loginMB")
@Scope("session")
public class LoginController{
     
    /** The user name. */
    private String userName = null;
     
    /** The password. */
    private String password = null;
 
    @Autowired
    private AuthenticationManager authenticationManager = null;    
    
    /**
     * Login.
     *
     * @return the string
     */
    public String login() {
    	boolean loggedIn = false;
    	RequestContext context = RequestContext.getCurrentInstance();
    	FacesMessage msg = null; 
    	try {
        	Authentication request = new UsernamePasswordAuthenticationToken(this.getUserName(), this.getPassword());
            Authentication result = authenticationManager.authenticate(request);
            SecurityContextHolder.getContext().setAuthentication(result);
            loggedIn = true;  
            
        }catch(UsernameNotFoundException usernameNotFoundException) {
        	loggedIn = false;  
        	msg = new FacesMessage(FacesMessage.SEVERITY_WARN,"Le login ou le mot de passe que vous avez saisi est incorrect.","Login Error");
        }catch (BadCredentialsException badCredentialsException) {
        	loggedIn = false; 
        	msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Le login ou le mot de passe que vous avez saisi est incorrect.", "Login Error");
        	
    	}catch (AuthenticationException e) {
    		loggedIn = false;  
    		msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Le login ou le mot de passe que vous avez saisi est incorrect.", "Login Error");
        }
    	
    	//context.addCallbackParam("loggedIn", loggedIn);
    	if(loggedIn)
    		return "loginOK";
    	else
    		FacesContext.getCurrentInstance().addMessage(null, msg);
        return "";
    }
    
    public String logout(){   	
    	SecurityContextHolder.clearContext();
        /**
         * Delete Cookies
         */
        HttpServletRequest httpServletRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext()
                .getResponse();
        Cookie cookie = new Cookie("SPRING_SECURITY_REMEMBER_ME_COOKIE", null);
        cookie.setMaxAge(0);
        cookie.setPath(httpServletRequest.getContextPath().length() > 0 ? httpServletRequest.getContextPath() : "/");
        httpServletResponse.addCookie(cookie);
   
    	return "login";
    }
     
    /**
     * Cancel.
     *
     * @return the string
     */
    public String cancel() {
        return null;
    }
 
    public AuthenticationManager getAuthenticationManager() {
        return authenticationManager;
    }
 
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }
 
    /**
     * Gets the user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }
 
    /**
     * Sets the user name.
     *
     * @param userName
     *            the new user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }
 
    /**
     * Sets the password.
     *
     * @param password
     *            the new password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
