package com.mc.salesorders;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.stereotype.Component;


import com.mc.consumer.doamin.Consumer;

@Component
public class KafkaConfiguration {
	
	
	@Bean
	 public ConsumerFactory<String, Consumer> ConsumerFactory() {
		 Map<String, Object> config = new HashMap<>();
		 config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
	        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
	        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
	        
	        return new DefaultKafkaConsumerFactory<>(config,new StringDeserializer(),
	        		new JsonDeserializer<>(Consumer.class));
	 }
	
	@Bean
	public 	ConcurrentKafkaListenerContainerFactory<String,Consumer> consumerKafkaListenerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, Consumer> factory  =  new ConcurrentKafkaListenerContainerFactory<>();
		 factory.setConsumerFactory(ConsumerFactory());
		 return factory;
	}
}
