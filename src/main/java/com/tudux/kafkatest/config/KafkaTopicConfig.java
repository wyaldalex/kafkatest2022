package com.tudux.kafkatest.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	/*Dummy console consumer
	 * .\kafka-console-consumer.bat --topic testingTopic --from-beginning --bootstrap-server localhost:9092 
	 * */
	
	
	@Bean
	public NewTopic testTopic() {
		return TopicBuilder.name("testingTopic")
				.build();
	}

}
