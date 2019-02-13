package com.frankxulei.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.frankxulei.iservice.IUserService;
import com.frankxulei.models.Users;
import com.frankxulei.repository.UserRepository;

/**
 * @author: Frank Xu Lei
 * @date: 20181228
 * @time: 下午3:43:19
 * @fileName: UserService.java
 * @ClassName: UserService
 */
@Service
public class UserService implements IUserService {

	private UserRepository userRepository;
	
	public int addUser(Users user) {
		int result = userRepository.add(user);
		return result;
	}

	public Users findUser(String username, String password) {
		Users result = userRepository.getUsersByNameAndPassword(username, password);
		return result;
	}

	public boolean checkUser(String name, String password) {
		Users result = userRepository.getUsersByNameAndPassword(name, password);
		if (result == null) {
			return false;
		} else {
			return true;
		}
	}

	public int updateUser(Users user)  
	{
		return userRepository.update(user);			
	}
	
	public Users getUserById(Long userId)  
	{
		Users result=userRepository.getUsersById(userId);
		return result;	
	}
	
	public int deleteUser(Long userId)  
	{
		return userRepository.delete(userId);
	}
	
	public List<Users> getAllUsers() 
	{	
		List<Users> result=userRepository.getAllUsers();
		return result;
	}

	 

}
