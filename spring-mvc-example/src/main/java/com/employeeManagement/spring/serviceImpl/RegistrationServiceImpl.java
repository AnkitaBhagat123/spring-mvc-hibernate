package com.employeeManagement.spring.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.employeeManagement.spring.dao.RegistrationDao;

import com.employeeManagement.spring.model.Registration;
import com.employeeManagement.spring.service.RegistrationService;
@Service
public class RegistrationServiceImpl implements RegistrationService{
	private RegistrationDao registrationDAO;

	@Override
	@Transactional
	public void addRegister(Registration registration) {
		getRegistrationDAO().addRegistration(registration);
		
	}

	public RegistrationDao getRegistrationDAO() {
		return registrationDAO;
	}

	public void setRegistrationDAO(RegistrationDao registrationDAO) {
		this.registrationDAO = registrationDAO;
	}

}
