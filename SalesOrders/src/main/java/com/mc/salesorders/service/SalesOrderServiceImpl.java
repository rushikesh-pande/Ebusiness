package com.mc.salesorders.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mc.salesorders.dao.SalesOrderRepository;
import com.mc.salesorders.domain.CustomerSos;
import com.mc.salesorders.domain.SalesOrder;
import com.mc.salesorders.dto.SalesOrderDto;


@Service
public class SalesOrderServiceImpl implements SalesOrderService{
	
	@Autowired
	SalesOrderRepository  salesOrderRepository;
	
	private ModelMapper modelMapper;
	
	public SalesOrderServiceImpl() {
		modelMapper = new ModelMapper();
	}

	@Override
	public SalesOrder save(SalesOrder salesOrders) {
	SalesOrderDto returnSalesOrder= salesOrderRepository.save(modelMapper.map(salesOrders,SalesOrderDto.class)); 
		
		return modelMapper.map(returnSalesOrder, SalesOrder.class);
	}

	@Override
	public SalesOrder getSalesOrderDetails(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SalesOrder> getAllSalesOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerSos save(CustomerSos customerSos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ValidateCustomer(String customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ValidateItem(String item) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
