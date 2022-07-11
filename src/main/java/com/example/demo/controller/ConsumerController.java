package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Consumer;
import com.example.demo.service.ConsumerService;

@RestController
public class ConsumerController {
	
	private ConsumerService service;
	
	public ConsumerController(ConsumerService service) {
		this.service = service;
	}
	
	//API : http://localhost:8080/get-all-current-rates
	@RequestMapping("/get-all-current-rates")
	public List<Consumer> getCurrentRates(){
		return service.getConsumer();
	}
	
	//API : http://localhost:8080/get-current-rate-by-type/{consumerType}
	@GetMapping("/get-current-rate-by-type/{type}")
	public Consumer getConsumerByType(@PathVariable String type) {
		return service.getConsumerByType(type);
	}
	
	@PutMapping("/revise-consumer-rates")
	public Consumer updateConsumer(Consumer consumer) {
		return service.updateConsumer(consumer);
	}
}
