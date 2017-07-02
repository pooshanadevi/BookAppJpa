package com.devi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devi.repository.BookRepository;
import com.devi.repository.OrderItemRepository;
import com.devi.user.OrderItem;

@Service
public class OrderItemService {



	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private BookRepository bookRepository;

	public void save(OrderItem orderItem) {
		orderItemRepository.save(orderItem);

}
}
