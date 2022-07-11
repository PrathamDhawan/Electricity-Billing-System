package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Consumer;
import com.example.demo.repository.BillRepository;

@Service
public class ConsumerService {
	
	private BillRepository repo;
	
	public ConsumerService(BillRepository repo) {
		this.repo = repo;
	}
	
	public List<Consumer> getConsumer() {
		return repo.findAll();
	}

	public Consumer getConsumerByType(String consumerType) {
		return repo.findById(consumerType).orElse(null);
	}
	
	public Consumer updateConsumer(Consumer consumer) {
		Consumer existingConsumer = repo.findById(consumer.getConsumerType()).orElse(null);
		existingConsumer.setFreeUnits(consumer.getFreeUnits());
		existingConsumer.setPerUnitPrice(consumer.getPerUnitPrice());
		return repo.save(existingConsumer);
	}
}
