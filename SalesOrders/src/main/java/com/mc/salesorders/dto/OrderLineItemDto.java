package com.mc.salesorders.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OrderLineItem")
public class OrderLineItemDto {


	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="itemName")
	private String itemName;
	
	@Column(name="itemQuantity")
	private Integer itemQuantity;
	
	@Column(name="orderId")
	private String orderId;
	
	@ManyToOne
    //@JoinColumn(name = "id")
	@JoinTable(name = "SalesOrder", joinColumns =@JoinColumn(name = "orderId", referencedColumnName = "id"))
	//@JoinColumn(name = "id")
	// @ManyToOne(fetch = FetchType.EAGER)
	SalesOrderDto salesOrderDto;
	
	public OrderLineItemDto() {
		
	}
	
	public SalesOrderDto getSalesOrderDto() {
		return salesOrderDto;
	}
	public void setSalesOrderDto(SalesOrderDto salesOrderDto) {
		this.salesOrderDto = salesOrderDto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
