package com.example.sample.service;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.sample.avro.User;

@Service
public final class ConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "user-details", groupId = "test-gid")
    public void consume(ConsumerRecord<String, User> user) {
        logger.info(String.format("$$$$ => Consumed message: %s", user.value().getFirstName()));
        logger.info(String.format("$$$$ => Consumed message: %s", user.value().getEmails()));
    }
}