package com.task2.repositiry;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.task2.entity.Order;

@Repository

public interface orderrepo extends JpaRepository<Order, Integer>{
	
	 @Query("SELECT o FROM Order o WHERE o.orderDate >= :sevenDaysAgo")
	    Collection<Order> findAllOrdersPlacedWithinLast7Days(@Param("sevenDaysAgo") LocalDate sevenDaysAgo);
}
