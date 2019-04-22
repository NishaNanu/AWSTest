package com.mywork.test2.Orderservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CreateOrderController {
	@RequestMapping("/createOrder")
	public String getOrder(){
		
		return "Got the order!!";
	}

}
