package com.mc.consumer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mc.consumer.doamin.Consumer;


@Service
public interface ConsumerService {
	public Consumer save(Consumer consumer);
	public Consumer getCustomerDetails(String name);
	public List<Consumer> getAllCustomer();
}
