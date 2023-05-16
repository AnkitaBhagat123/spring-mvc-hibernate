package com.employeeManagement.spring.serviceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employeeManagement.spring.dao.UserDao;
import com.employeeManagement.spring.model.User;
import com.employeeManagement.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDao userDAO;

	public UserDao getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDao userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void addPerson(User user) {
		getUserDAO().addUser(user);

	}

}
