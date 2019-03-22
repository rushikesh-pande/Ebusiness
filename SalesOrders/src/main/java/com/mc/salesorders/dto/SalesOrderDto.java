package com.mc.salesorders.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SalesOrder")
public class SalesOrderDto {

@Id
@GeneratedValue
@Column(name="id")
private long id;
@Column(name="orderDate")
private String orderDate;
@Column(name="customerId")
private String customerId;
@Column(name="orderDesc")
private String orderDesc;
@Column(name="price")
private long price;

@OneToMany(mappedBy = "salesOrderDto", cascade = CascadeType.ALL)
private List<OrderLineItemDto> lineItemsList;

public SalesOrderDto() {
	
}
public List<OrderLineItemDto> getLineItemsList() {
	return lineItemsList;
}
public void setLineItemsList(List<OrderLineItemDto> lineItemsList) {
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
