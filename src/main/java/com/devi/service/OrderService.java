package com.devi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devi.repository.OrderItemRepository;
import com.devi.repository.OrderRepository;
import com.devi.user.Order;




@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public void save(Order order) {
		orderRepository.save(order);
		
	}
	
	public List<Order> findAllOrders(){
		return orderRepository.findByOrderByIdDesc();
	}
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findOne(Long id){
		return orderRepository.findOne(id);
	}
	
	public List<Order> findByUserIdOrderByIdDesc(int userid){
		return orderRepository.findByUserIdOrderByIdDesc(userid);
	}

}



		
	
	

