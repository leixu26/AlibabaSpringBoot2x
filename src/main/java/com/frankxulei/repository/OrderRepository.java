package com.frankxulei.repository;

import java.util.List;

import com.frankxulei.models.Order;
public interface OrderRepository {

	    int add(Order order);
	    
	    Order getById(Long id);
	    
	    List<Order> getAll();
 
	    int update(Order order);
	    
	    int delete(Long id);
}
