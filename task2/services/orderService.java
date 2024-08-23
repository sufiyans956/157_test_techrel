package com.task2.services;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.beans.factory.annotation.Autowired;

import com.task2.entity.Order;
import com.task2.repositiry.orderrepo;

public class orderService {
	@Autowired
	private orderrepo ox;
	
	public Order addorder(Order neworder) {
		
		return ox.save(neworder);
		
		
		
	}
	
	public Order getOneOrder(Integer id) {
		Order foundorder = null;
		Optional<Order> getOneorder = ox.findById(id);
		if (!getOneorder.isEmpty())
			foundorder = getOneorder.get();
		return foundorder;
	}
	 
	public Collection<Order> getSevendata() {
		LocalDate sevenDaysAgo = LocalDate.now().minusDays(7);
		return ox.findAllOrdersPlacedWithinLast7Days(sevenDaysAgo);


	}
	public Order updateamount(Order oldorder, Order neworder) {
		oldorder.setTotalamount(oldorder.getTotalamount());
		
		ox.save(oldorder);
		
		return oldorder;

		
	}
	

}
