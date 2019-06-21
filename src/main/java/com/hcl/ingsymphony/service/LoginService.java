package com.hcl.ingsymphony.service;

import java.util.List;

import com.hcl.ingsymphony.dto.LoginReqDTO;
public interface LoginService {

	List<LoginResDTO> validateLogin(LoginReqDTO userLoginDto);

}