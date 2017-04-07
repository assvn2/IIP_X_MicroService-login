package com.hsbc.group.iip.x.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.hsbc.group.iip.x.dao.FindUser;
import com.hsbc.group.iip.x.model.LoginRequest;
import com.hsbc.group.iip.x.model.LoginResponse;
import com.hsbc.group.iip.x.model.ResponseDetails;
import com.hsbc.group.iip.x.model.User;
import com.hsbc.group.iip.x.model.UserDetails;
import com.hsbc.group.iip.x.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginResponse loginResponse;
	
	@Autowired
	private User user;
	
	@Autowired
	private FindUser findUser;
	
	@Autowired
	private ResponseDetails responseDetails;
	
	@Override
	public LoginResponse login(LoginRequest loginRequest) {
		user = loginRequest.getUser();
		
		if(checkUser(user)){
			responseDetails.setResponseCode("0");
			loginResponse.setResponseDetails(responseDetails);
		}
		loginResponse.setUserDetails(getUserDetails(user.getUserName()));
		return loginResponse;
	}

	private UserDetails getUserDetails(String userName) {
		
		return findUser.findUserByName(userName);
	}

	private boolean checkUser(User user) {
		String name = user.getUserName();
		String psw = user.getPassword();
		if(StringUtils.isEmpty(name)){
			return false;
		}
		
		if(StringUtils.isEmpty(psw)){
			return false;
		}
		
		return true;
	}

}
