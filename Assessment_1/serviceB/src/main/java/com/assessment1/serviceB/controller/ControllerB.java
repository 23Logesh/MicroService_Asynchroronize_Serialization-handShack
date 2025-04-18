package com.assessment1.serviceB.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment1.serviceB.dto.Dto; 
import com.assessment1.serviceB.service.ServiceB;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/serviceB")
@Slf4j
public class ControllerB {

    @Autowired
    private ServiceB serviceB;

    @PostMapping
    public Dto saveEntity(@RequestBody Dto obj) {
        log.info("[ControllerB] Received request to save entity: {}", obj);

        Dto savedDto = serviceB.saveEntity(obj);

        log.info("[ControllerB] Successfully saved entity: {}", savedDto);
        return savedDto;
    }
}
