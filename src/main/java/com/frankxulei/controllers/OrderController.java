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

import com.frankxulei.models.Order;
import com.frankxulei.repository.OrderRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
/**
 * 《阿里巴巴Java Spring Boot 2.0开发实战课程》 完全免费 
 * 特邀讲师 徐雷 Frank Xu
 * 淘宝订单 API接口OrderController
 */
@RestController
@RequestMapping("/api/v1/orders")
@Api(value = " 淘宝订单 API接口, taobao Order REST API", description = "淘宝订单 API接口，api of  orders in TaoBao  System")
public class OrderController {
	private OrderRepository orderRepository;

	@ApiOperation(value = "查询所有订单,get a list of all orders", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping("/getAll")
	public List<Order> getAll() {
		return orderRepository.getAll();
	}

	@ApiOperation(value = "查询单个订单，Get an Order by Id")
	@GetMapping("/getById/{id}")
	public ResponseEntity<Order> getById(
			@ApiParam(value = "Order id from which Order object will retrieve", required = true) @PathVariable(value = "id") Long id) {
		Order order = orderRepository.getById(id);

		return ResponseEntity.ok().body(order);
	}

	@ApiOperation(value = "新增订单，Add an new order")
	@PostMapping("/add")
	public int create(
			@ApiParam(value = "Order object store in database table", required = true) @Valid @RequestBody Order order) {
		return orderRepository.add(order);
	}

	@ApiOperation(value = "更新订单，Update an order")
	@PutMapping("/put/{id}")
	public ResponseEntity<Integer> updateUser(
			@ApiParam(value = "User Id to update user object", required = true) @PathVariable(value = "id") Long id,
			@ApiParam(value = "Update user object", required = true) @Valid @RequestBody Order order) {

		final int result = orderRepository.update(order);
		return ResponseEntity.ok(result);
	}

	@ApiOperation(value = "删除订单，Delete an order")
	@DeleteMapping("/delete/{id}")
	public Map<String, Boolean> deleteUser(
			@ApiParam(value = "User Id from which user object will delete from database table", required = true) @PathVariable(value = "id") Long id) {

		orderRepository.delete(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
