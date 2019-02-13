package com.frankxulei.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frankxulei.models.Users;
import com.frankxulei.repository.UserRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1/users")
@Api(value = "淘宝用户 API接口 taobao Users REST API", description = "淘宝用户 API接口，api of  users in TaoBao  System")
public class UserController {

	private UserRepository userRepository;

	@ApiOperation(value = "View a list of available users", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping("/users")
	public List<Users> getAllUsers() {
		return userRepository.getAllUsers();
	}

	@ApiOperation(value = "Get an user by Id")
	@GetMapping("/users/{id}")
	public ResponseEntity<Users> getUserById(
			@ApiParam(value = "User id from which user object will retrieve", required = true) @PathVariable(value = "id") Long userId) {
		Users user = userRepository.getUsersById(userId);

		return ResponseEntity.ok().body(user);
	}

	@ApiOperation(value = "Add an user")
	@PostMapping("/users")
	public int createUser(
			@ApiParam(value = "User object store in database table", required = true) @Valid @RequestBody Users user) {
		return userRepository.add(user);
	}

	@ApiOperation(value = "Update an user")
	@PutMapping("/users/{id}")
	public ResponseEntity<Integer> updateUser(
			@ApiParam(value = "User Id to update user object", required = true) @PathVariable(value = "id") Long userId,
			@ApiParam(value = "Update user object", required = true) @Valid @RequestBody Users user)
	{
 
		final int updatedUser = userRepository.update(user);
		return ResponseEntity.ok(updatedUser);
	}

	@ApiOperation(value = "Delete an user")
	@DeleteMapping("/users/{id}")
	public Map<String, Boolean> deleteUser(
			@ApiParam(value = "User Id from which user object will delete from database table", required = true) @PathVariable(value = "id") Long userId)
			  {
 
		userRepository.delete(userId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
