package com.mc.salesorders.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.mc.consumer.doamin.Consumer;

@Service
public class KafkaConsumer {

	
	 @KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
	            containerFactory = "consumerKafkaListenerFactory")
	 public Consumer consumeCustomerMessage(Consumer consumer) {
		 System.out.println("Consumed consumer JSON Message: " + consumer);
		 return consumer;
	 }
}
