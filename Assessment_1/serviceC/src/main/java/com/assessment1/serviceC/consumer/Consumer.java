package com.assessment1.serviceC.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.assessment1.serviceC.service.ServiceC;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Consumer {

    @Autowired
    private ServiceC serviceC;

    @KafkaListener(topics = "ServerB-topic", groupId="my-group")
    public void saveEntity(String message) {
        log.info("[Consumer] Received message: {}", message);
        
        serviceC.saveEntity(message);
        
        log.info("[Consumer] Processed message and saved entity.");
    }
}
