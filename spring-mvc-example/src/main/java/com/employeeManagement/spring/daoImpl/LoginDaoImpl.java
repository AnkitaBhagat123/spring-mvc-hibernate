package com.employeeManagement.spring.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.employeeManagement.spring.dao.LoginDao;
import com.employeeManagement.spring.model.Login;
import com.employeeManagement.spring.model.Registration;
@Repository
public class LoginDaoImpl implements LoginDao{
private static final Logger logger = LoggerFactory.getLogger(RegistrationDaoImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public String addLogin(Registration login) {
		Session session = this.sessionFactory.getCurrentSession();
		
		
		Query query = session.createQuery("SELECT u.userName FROM Registration u WHERE u.userName=:userName");
	 query.setParameter("userName", login.getUserName());
		/* System.out.println(query.uniqueResult()); */
	 return (String)query.uniqueResult();
	
	/*
	 * Query query1=session.
	 * createQuery("select u.password from Registration u where u.password=:password"
	 * );
	 * 
	 * System.out.println(query1.uniqueResult());
	 */
}
}
	



