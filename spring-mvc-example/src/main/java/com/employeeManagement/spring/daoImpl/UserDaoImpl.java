package com.employeeManagement.spring.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.employeeManagement.spring.dao.UserDao;
import com.employeeManagement.spring.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
		logger.info("User saved successfully, User Details=" + user);

	}

	
}
