package com.mc.salesorders.domain;

public class CustomerSos {
 private Long id;
 private String customerId;
 private String salesOrderId;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getSalesOrderId() {
	return salesOrderId;
}
public void setSalesOrderId(String salesOrderId) {
	this.salesOrderId = salesOrderId;
}
}
