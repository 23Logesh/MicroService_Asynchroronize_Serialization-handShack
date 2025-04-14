package com.verinite.base_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	private OrderProducer producer;
	
    @GetMapping("/check")
    public String placeOrder(@RequestParam String message) {
    	System.out.print("IN ORDER SERVICE");
    	producer.sendMessage("order-service-topic", message);
    	return "Data published Successfully";
    }
}
