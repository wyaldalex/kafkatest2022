package com.tudux.kafkatest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tudux.kafkatest.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
	
	private KafkaProducer kafkaProducer;
	
	public MessageController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;		
		
	}
	
	@GetMapping
	public ResponseEntity<String> publish(@RequestParam("message") String message) {
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("Message was sent to the topic");
		
	}

}
