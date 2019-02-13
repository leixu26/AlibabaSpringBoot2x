package com.frankxulei.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.frankxulei.models.Users;

import io.swagger.annotations.Api;

@Controller
@RequestMapping("/api/v2/users")
@Api(value = "淘宝用户 API接口 taobao Users REST API V2.0", description = "淘宝用户 API接口 api of  users in TaoBao  System")
public class UsersController {

 
	@RequestMapping("/index")
	public List<Users> index() {
		List<Users> listUsers =  new ArrayList<>();//userService.getAllUsers();
		Users user =  new Users();//.getUserById(id);
		user.setAge(18);
		user.setName("小马哥");
		user.setAddress("阿里巴巴 杭州");
		user.setId(1);
		listUsers.add(user);
		return listUsers;
	}
	
	@RequestMapping("/detail/{id}")
	public Users detail(@PathVariable("id") Long id) {
		Users user =  new Users();//.getUserById(id);
		user.setAge(18);
		user.setName("小马哥");
		user.setAddress("阿里巴巴 杭州");
		user.setId(id);
		return user;
	}
 
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public int add(@ModelAttribute("user") Users user) {
		//新增
		System.out.println(user.getName());
		return -1;//userService.addUser(user);
	}
 
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public int edit(@ModelAttribute("User") Users user) {
		//编辑
		System.out.println(user.getName());
		return -1;//userService.updateUser(user);
	}
	
	@RequestMapping("/delete/{id}")
	public int delete(@PathVariable("id") Long id) {
		return -1;//userService.deleteUser(id);
	}
	
}
