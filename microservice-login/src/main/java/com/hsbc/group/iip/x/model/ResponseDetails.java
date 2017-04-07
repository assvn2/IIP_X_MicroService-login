package com.hsbc.group.iip.x.model;

import org.springframework.stereotype.Component;

@Component
public class ResponseDetails {
	private String responseCode;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
}	
