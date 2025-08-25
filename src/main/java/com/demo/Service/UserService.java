package com.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.respostiory.UserRepo;

@Service
public class UserService {
@Autowired
UserRepo repo;
	
	public void add(User user)
	{
		repo.save(user);
		
		
	}

}
