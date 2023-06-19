package com.exmaple.service;

import java.util.List;

import com.exmaple.entity.Order;

public interface OrderService {
	public List<Order> getAllOrders();

	public Order getOrderById(int id);
}
