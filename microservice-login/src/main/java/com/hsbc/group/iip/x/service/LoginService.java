package com.hsbc.group.iip.x.service;

import com.hsbc.group.iip.x.model.LoginRequest;
import com.hsbc.group.iip.x.model.LoginResponse;

public interface LoginService {
	LoginResponse login(LoginRequest loginRequest);
}
