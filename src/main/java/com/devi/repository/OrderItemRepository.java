package com.devi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devi.user.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
