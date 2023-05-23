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

	
	/*
	 * @Override
	 * 
	 * @Transactional public void editRegister(int id) {
	 * 
	 * getRegistrationDAO().editRegistrationBYId(id);
	 * 
	 * }
	 */
	public RegistrationDao editRegisterDAO() {
		return registrationDAO;
	}

	

	@Override
	@Transactional
	public List<Registration> getAllReg() {
		
		return registrationDAO.getAllReg();
	}

	@Override
	@Transactional
	public void deleteRegistration(int id) {
		registrationDAO.deleteRegistration(id);
	}

	@Override
	public Registration getById(int id) {
	return	null;
		
	}

	@Override
	@Transactional
	public void editRegister(Registration reg) {
		
		registrationDAO.getAllReg();
	}

	
}
	