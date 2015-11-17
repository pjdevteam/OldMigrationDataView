package com.accenture.oldmigrationdataview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.oldmigrationdataview.domain.User;
import com.accenture.oldmigrationdataview.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll(new Sort(Sort.Direction.ASC, "userName"));
	}
	
	public User findOne(String userName) {
		return repository.findOne(userName);
	}
	
	public User save(User user) {
		return repository.save(user);
	}
	
	public void delete(String userName) {
		repository.delete(userName);
	}
}
