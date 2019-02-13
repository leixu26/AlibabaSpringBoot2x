package com.frankxulei.repository;

import java.util.List;


import com.frankxulei.models.Users;

public interface UserRepository {

	    int add(Users user);    
	    Users getUsersById(Long userId);   
	    List<Users> getAllUsers();  
	     Users getUsersByName(String name);  
	    Users getUsersByNameAndPassword(String name, String password);
	    int update(Users user);
	    int delete(Long userId);
}
