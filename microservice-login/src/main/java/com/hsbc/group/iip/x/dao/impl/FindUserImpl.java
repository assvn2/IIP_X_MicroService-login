package com.hsbc.group.iip.x.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hsbc.group.iip.x.dao.FindUser;
import com.hsbc.group.iip.x.model.UserDetails;

@Repository
public class FindUserImpl implements FindUser{

	@Autowired
	private UserDetails userDetails;
	
	@Override
	public UserDetails findUserByName(String userName) {
		userDetails.setChName("秦玉河");
		userDetails.setEnName("Herry");
		userDetails.setStaffId("66666");
		return userDetails;
	}

	@Override
	public UserDetails findUserById(String staffId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails findUserByPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
