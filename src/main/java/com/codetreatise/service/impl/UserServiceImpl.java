package com.codetreatise.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codetreatise.bean.User;
import com.codetreatise.repository.UserRepository;
import com.codetreatise.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User save(User entity) {
		return userRepository.save(entity);
	}

	@Override
	public User update(User entity) {
		return userRepository.save(entity);
	}

	@Override
	public void delete(User entity) {
		userRepository.delete(entity);
	}

	@Override
	public void delete(Long id) {
		userRepository.delete(id);
	}

	@Override
	public User find(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public boolean authenticate(String username, String password){
		if(username.equals("ram") && password.equals("ram")) return true;
		else return false;
	}
	
}