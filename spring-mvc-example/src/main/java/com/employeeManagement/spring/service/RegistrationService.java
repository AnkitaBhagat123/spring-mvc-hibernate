package com.employeeManagement.spring.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employeeManagement.spring.dao.RegistrationDao;
import com.employeeManagement.spring.model.Registration;

public interface RegistrationService {
	
	public void addRegister(Registration registration);
	public List<Registration>getAllReg();
	public Registration getById(int id);
    public void deleteRegistration(int id);
	public void editRegister(Registration reg);
	
	

}
