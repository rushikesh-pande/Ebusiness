package com.mc.salesorders.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mc.salesorders.dto.CustomerSOSDto;

@Repository
public interface CustomerSosRepository extends CrudRepository<CustomerSOSDto, Long>{
	public CustomerSOSDto findByCustomerId(String customerId);
}
