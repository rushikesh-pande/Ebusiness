package com.mc.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.mc.consumer.doamin.Consumer;
import com.mc.consumer.service.ConsumerService;

@RequestMapping("/Customer")
@RestControllerAdvice
@RestController
public class ConsumerController {

	@Autowired
	ConsumerService consumerService;  

	private KafkaTemplate<String, Consumer> kafkaTemplate;
	
	private static final String TOPIC = "CUSTOMER_TOPIC";
	
	@PostMapping(value = "/add")
	public Consumer add(@RequestBody Consumer consumer) {
		System.out.println(consumer);
		kafkaTemplate.send(TOPIC,consumer);
		return consumerService.save(consumer);
	}
	
}
