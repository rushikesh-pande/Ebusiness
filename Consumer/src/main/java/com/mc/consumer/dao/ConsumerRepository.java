package com.mc.consumer.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mc.consumer.dto.ConsumerDto;

@Repository
public interface ConsumerRepository extends CrudRepository<ConsumerDto,Long>{
	public ConsumerDto findByFirstName(String firstName);
}
