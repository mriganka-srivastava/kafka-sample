package com.example.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.example.sample.avro.User;

@Service
public final class ProducerService {
	private static final Logger logger = LoggerFactory.getLogger(ProducerService.class);

	private final KafkaTemplate<String, User> kafkaTemplate;
	private final String TOPIC = "user-details";

	public ProducerService(KafkaTemplate<String, User> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(User user) {
		logger.info(String.format("$$$$ => Producing message: %s",  user.getFirstName()));

		ListenableFuture<SendResult<String, User>> future = this.kafkaTemplate.send(TOPIC, user);
		future.addCallback(new ListenableFutureCallback<>() {
			@Override
			public void onFailure(Throwable ex) {
				logger.info("Unable to send message=[ {} ] due to : {}", user.getFirstName(), ex.getMessage());
			}

			@Override
			public void onSuccess(SendResult<String, User> result) {
				logger.info("Sent message=[ {} ] with offset=[ {} ]", user.getFirstName(), result.getRecordMetadata().offset());
			}
		});
	}
}