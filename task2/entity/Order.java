package com.task2.entity;

import java.sql.Date;

import org.springframework.context.annotation.Primary;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Order {
	@Id
	int id;
	String CustomerName;
	Date orderdate;
	long totalamount;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String customerName, Date orderdate, long totalamount) {
		super();
		this.id = id;
		CustomerName = customerName;
		this.orderdate = orderdate;
		this.totalamount = totalamount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public long getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(long totalamount) {
		this.totalamount = totalamount;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", CustomerName=" + CustomerName + ", orderdate=" + orderdate + ", totalamount="
				+ totalamount + "]";
	}

}
