package com.employeeManagement.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.employeeManagement.spring.model.Registration;

public interface RegistrationDao {
	public void addRegistration(Registration registration);
	public List<Registration> getAllReg();
	@Transactional
	public void editRegistrationBYId(Registration registration);
	@Transactional
	public void deleteRegistration(String userName);
	

}
