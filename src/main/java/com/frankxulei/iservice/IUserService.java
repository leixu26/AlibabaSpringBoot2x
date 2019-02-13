package com.frankxulei.iservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.frankxulei.models.Users;

/**
 * @author: Frank Xu Lei
 * @date: 20190128
 * @time: 下午3:43:19
 * @fileName: UserService.java
 * @ClassName: UserService
 */
@Service
public interface IUserService {

	public int addUser(Users user);
	public Users findUser(String username, String password);
	public boolean checkUser(String name, String password);
	public int updateUser(Users user) ;
	public Users getUserById(Long userId);
	public int deleteUser(Long userId) ;
	public List<Users> getAllUsers();
}
