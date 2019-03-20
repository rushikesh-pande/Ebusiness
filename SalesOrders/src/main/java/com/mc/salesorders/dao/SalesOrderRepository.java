package com.mc.salesorders.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mc.salesorders.dto.SalesOrderDto;

@Repository
public interface SalesOrderRepository extends CrudRepository<SalesOrderDto, Long>
{
		public List<SalesOrderDto> findByCustomerId(String customerId);
		public List<SalesOrderDto> findByorderDate(String orderDate);
		
}
