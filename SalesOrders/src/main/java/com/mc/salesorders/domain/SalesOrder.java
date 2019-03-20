package com.mc.salesorders.domain;

import java.util.List;

public class SalesOrder {
private long id;
private String orderDate;
private String customerId;
private String orderDesc;
private long price;

private List<OrderLineItem> lineItemsList;

public List<OrderLineItem> getLineItemsList() {
	return lineItemsList;
}
public void setLineItemsList(List<OrderLineItem> lineItemsList) {
	this.lineItemsList = lineItemsList;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getOrderDesc() {
	return orderDesc;
}
public void setOrderDesc(String orderDesc) {
	this.orderDesc = orderDesc;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
}
