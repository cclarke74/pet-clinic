package com.clairclarke.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clairclarke.bean.User;
import com.clairclarke.dao.UserDao;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public List<User> list(){
		
		/*
		 * Add some Business Logic to process the list.
		 */
		
		return this.userDao.list();
	}
	
	public void createUser(User user) {
		this.validateUser(user);
		this.userDao.createUser(user);
	}
	
	public User findUser(User user) {
		return this.userDao.findUser(user);
	}
	public User findUser(int idUser) {
		return this.userDao.findUser(idUser);
	}
	
	public void updateUser(User user) {
		this.validateUser(user);
		this.userDao.updateUser(user);
		
	}
	
	public void deleteUser(int idUser) {
		this.userDao.deleteUser(idUser);
	}
	
	private void validateUser(User user) {
		if (user.getFirstName().isEmpty() || user.getLastName().isEmpty()  || user.getUsername().isEmpty()) {
			throw new RuntimeException("Invalid User Data: " +user);
			
		}
	}
}
