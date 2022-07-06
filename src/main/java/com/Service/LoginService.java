package com.Service;

import java.util.HashMap;

import com.dto.UseDTO;

public class LoginService {

	HashMap<String, String> userTable = new HashMap<>();

	public LoginService() {
		userTable.put("Kamal", "kamal wadungoda");
		userTable.put("saha ", " sahan perera");
		userTable.put("nimal", "nimal perera");

	}

	// login authontication method -usename and password
	public boolean authenticateUserLogin(String username, String password) {
		// implement JDBC with utill and test with database

		if (username.equals("nimal") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	//Model String 
	public String getFullNameByUserName(String username) {
		return userTable.get(username);
	}
	
	//model dto object
	public UseDTO getFullDetailsOfUser(String username) {
		UseDTO user =new UseDTO();
		user.setUserId(1);
		user.setName(userTable.get(username));
		user.setContactNo("0112515050");
		user.setAddress("120 dv road");
		
		return user;
	}
}
