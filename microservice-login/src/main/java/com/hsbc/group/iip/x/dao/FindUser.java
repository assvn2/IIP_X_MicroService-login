package com.hsbc.group.iip.x.dao;

import com.hsbc.group.iip.x.model.UserDetails;

public interface FindUser {
	UserDetails findUserByName(String userName);
	UserDetails findUserById(String staffId);
	UserDetails findUserByPhoneNumber(String phoneNumber);
}	
