package com.niit.techno.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.techno.crm.dao.UserDAO;
import com.niit.techno.crm.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO UserDAO;
	
	@Transactional
	public User checkUser(User theUser) {
		
		return UserDAO.checkUser(theUser);
	}

}
