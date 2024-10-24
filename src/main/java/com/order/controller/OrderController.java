package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.OrderEntity;
import com.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@PostMapping("/addOrder")
	public ResponseEntity<OrderEntity> addOrder(@RequestBody OrderEntity entity){
		OrderEntity order = orderService.createOrder(entity);
		return new ResponseEntity<OrderEntity>(order,HttpStatus.CREATED);
		
	}

//	@GetMapping("/fetch/{id}")
//	public ResponseEntity<OrderEntity> fetchProducts(@PathVariable Integer id) {
//       OrderEntity productDetails = orderService.getProductDetails(id);
//		return new ResponseEntity<OrderEntity>(productDetails, HttpStatus.OK);
//
//	}

}
