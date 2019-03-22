package com.mc.salesorders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mc.consumer.doamin.Consumer;
import com.mc.salesorders.domain.SalesOrder;
import com.mc.salesorders.service.SalesOrderService;

@RequestMapping("/Sales")
@RestControllerAdvice
@RestController
public class SalesOrdercontroller {

	@Autowired
	SalesOrderService orderService;
	
	private KafkaTemplate<String, Consumer> kafkaTemplate;
	
	private static final String TOPIC = "CUSTOMER_TOPIC";
	
	@PostMapping(value = "/add")
	public SalesOrder add(@RequestBody SalesOrder salesOrder) {
		//System.out.println(consumer);
		//kafkaTemplate.send(TOPIC,consumer);
		return orderService.save(salesOrder);
	}
}
