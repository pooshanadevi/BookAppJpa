package com.devi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devi.user.Order;



public interface OrderRepository extends JpaRepository<Order,Long> {
public List<Order> findByUserIdOrderByIdDesc(int userid);
	
	public List<Order> findByOrderByIdDesc();
	

}
