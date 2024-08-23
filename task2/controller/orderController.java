package com.task2.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task2.entity.Order;
import com.task2.services.orderService;

@RestController
public class orderController {
	@Autowired
	private orderService os;
	
	@PostMapping("/adduser")
	public Order addusers(@RequestBody Order us) {
		
		return os.addorder(us);
	}
	
	@GetMapping("/getseven")
	public Collection<Order> allorder(){	
		return os.getSevendata();
				
	}
	@PutMapping("/updateorderamt/{id}")
	public Order updatePassword(@PathVariable int id, @RequestBody Order updatedamt) {
		Order existamt = os.getOneOrder(id);
		return os.updateamount(updatedamt, existamt);
	
	}
	

}
