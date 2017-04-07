package com.hsbc.group.iip.x.model;

import org.springframework.stereotype.Component;

@Component
public class LoginResponse {
	private ResponseDetails responseDetails;
	private UserDetails userDetails;
	public ResponseDetails getResponseDetails() {
		return responseDetails;
	}
	public void setResponseDetails(ResponseDetails responseDetails) {
		this.responseDetails = responseDetails;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
}
