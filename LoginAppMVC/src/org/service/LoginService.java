package org.service;

import java.util.HashMap;

import org.hcl.servlet.dto.User;



public class LoginService {
HashMap<String,String> users=new HashMap<String,String>();
	public LoginService() {
		users.put("teja","teja");
		users.put("roja","roja");
		users.put("pooja","pooja");
	}
	public boolean authenticate(String userId, String password) {
		if(password==null|| password.trim()== "") {
		return false;
	}
 return true;
}
public User getUserDetails(String userId) {

	User user = new User();
	user.setUserName(users.get(userId));
	user.setUserId(userId);
	return user;
}
}