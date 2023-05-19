package com.employeeManagement.spring.daoImpl;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.employeeManagement.spring.dao.RegistrationDao;
import com.employeeManagement.spring.model.Registration;
import com.employeeManagement.spring.model.User;
@Repository
public class RegistrationDaoImpl implements RegistrationDao{
	
private static final Logger logger = LoggerFactory.getLogger(RegistrationDaoImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	

	@Override
	public void addRegistration(Registration registration) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(registration);
		logger.info("Registration saved successfully, Registration Details="+registration);
		
	}

@Override
	public void editRegistrationBYId(Registration registration) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(registration);
		logger.info("Registration saved successfully, Registration Details="+registration);
		
	}

}
