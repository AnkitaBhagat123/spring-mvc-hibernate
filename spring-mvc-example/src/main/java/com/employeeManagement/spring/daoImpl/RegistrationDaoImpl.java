package com.employeeManagement.spring.daoImpl;



import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Query;
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
	public void editRegistrationBYId(int id) {
	Session session = this.sessionFactory.getCurrentSession();
	Query query=session.createQuery("Update  Registration SET firstName=:ufirstName,lastName=:ulastName,address=:uaddress,mobileNo=:umobileNo"+ "WHERE id=:uid");
	query.setParameter("uid", id);
	int i=query.executeUpdate();
	System.out.println(i);
	
	/*
	 * session.persist(id); sessionFactory.getCurrentSession().update(id);
	 */
		
		
}


@Override
public List<Registration> getAllReg() {
	Session session = this.sessionFactory.getCurrentSession();
	Query query=session.createQuery("SELECT u FROM Registration u");
	return (List<Registration>)query.list();
}

@Override
public void deleteRegistration(int id)
{
	Session session=this.sessionFactory.getCurrentSession();
	Query query=session.createQuery("delete FROM Registration u WHERE u.id=:uid");
	query.setParameter("uid",id);
	int i=query.executeUpdate();
	System.out.println(i);
	
}


@Override
public Registration getRegById(int id) {
	Session session = this.sessionFactory.getCurrentSession();
	Query query=session.createQuery("Select u from Registration WHERE u.id=:uid");
	query.setParameter("uid", id);
	 query.uniqueResult();
	return null;
}


@Override
public void editRegistrationBYId(Registration registration) {
	// TODO Auto-generated method stub
	
}

}
