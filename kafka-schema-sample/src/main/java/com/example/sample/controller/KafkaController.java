package com.example.sample.controller;



import java.util.Arrays;
import java.util.Calendar;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.avro.Address;
import com.example.sample.avro.EnumType;
import com.example.sample.avro.User;
import com.example.sample.service.ProducerService;

@RestController
@RequestMapping("/kafka")
public final class KafkaController {
    private final ProducerService producerService;

    public KafkaController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam String message) {
    	User user = new User();
    	user.setFirstName(message);
    	user.setLastName("Srivastava");
    	user.setAdult(true);
    	user.setAge(38);
    	user.setHeight(5.10f);
    	user.setWeight(165.5f);
    	user.setEmails(Arrays.asList("mriganka@gmail.com","test@test.com"));
    	user.setSignTS(Calendar.getInstance().getTimeInMillis());
    	Address address = new Address();
    	address.setAddressLine("test address");
    	address.setType(EnumType.RESIDENCE);
    	address.setCity("Palno");
    	address.setPostcode("234 retgr 546757");
    	//user.setAddress(address);
        producerService.sendMessage(user);
    }
}