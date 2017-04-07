package com.hsbc.group.iip.x.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.group.iip.x.model.User;
import com.hsbc.group.iip.x.model.LoginRequest;
import com.hsbc.group.iip.x.model.LoginResponse;
import com.hsbc.group.iip.x.service.LoginService;

@RestController
public class LoginAction{
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private LoginResponse loginResponse;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public LoginResponse login(@RequestBody LoginRequest loginRequest){
		
		loginResponse = loginService.login(loginRequest);
		
		return loginResponse;
	}
}
