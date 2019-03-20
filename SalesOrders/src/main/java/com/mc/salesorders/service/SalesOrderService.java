package com.mc.salesorders.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mc.salesorders.domain.CustomerSos;
import com.mc.salesorders.domain.SalesOrder;

@Service
public interface SalesOrderService {
	public SalesOrder save(SalesOrder salesOrders);
	public SalesOrder getSalesOrderDetails(String orderId);
	public List<SalesOrder> getAllSalesOrder();
	public CustomerSos save(CustomerSos customerSos);
	public boolean ValidateCustomer(String customerId);
	public boolean ValidateItem(String item);
}
