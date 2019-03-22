package com.mc.salesorders.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerSOS")
public class CustomerSOSDto {

	@Id
	@GeneratedValue
	@Column(name="id")
	 private Long id;
	
	@Column(name="customerId")
	 private String customerId;
	
	@Column(name="salesOrderId")
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
