package com.employeeManagement.spring.serviceImpl;

import javax.transaction.Transactional;

import com.employeeManagement.spring.dao.LoginDao;
import com.employeeManagement.spring.model.Login;
import com.employeeManagement.spring.model.Registration;
import com.employeeManagement.spring.service.LoginService;

public class LoginServiceImpl implements LoginService{
	private LoginDao loginDAO;

	public LoginDao getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginDao loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Override
	@Transactional
	public void addLogin(Registration login) {
		getLoginDAO().addLogin(login);
		
	}

	

}
