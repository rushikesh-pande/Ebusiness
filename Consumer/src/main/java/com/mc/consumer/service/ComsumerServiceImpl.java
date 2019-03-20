package com.mc.consumer.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.consumer.dao.ConsumerRepository;
import com.mc.consumer.doamin.Consumer;
import com.mc.consumer.dto.ConsumerDto;

@Service
public class ComsumerServiceImpl implements ConsumerService {


	@Autowired
	ConsumerRepository consumerRepository ;
	private ModelMapper modelMapper;
	
	public ComsumerServiceImpl(){
		modelMapper  = new ModelMapper();
	}
	
	@Override
	public Consumer save(Consumer consumer) {
		ConsumerDto dto = consumerRepository.save(modelMapper.map(consumer,ConsumerDto.class));
		return modelMapper.map(dto, Consumer.class);
	}

	@Override
	public Consumer getCustomerDetails(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Consumer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
