package com.employeeManagement.spring.serviceImpl;

import java.util.List;

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

	@Override
	@Transactional
	public void editRegister(Registration registration) {
	
		getRegistrationDAO().editRegistrationBYId(registration);;
		
	}
	public RegistrationDao editRegisterDAO() {
		return registrationDAO;
	}

	public void seteditRegisterDAO(RegistrationDao registrationDAO) {
		this.registrationDAO = registrationDAO;
	}

	@Override
	public List<Registration> getAllReg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRegistration(String userName) {
		// TODO Auto-generated method stub
		
	}
}
	