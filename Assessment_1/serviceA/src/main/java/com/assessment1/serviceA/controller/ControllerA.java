package com.assessment1.serviceA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment1.serviceA.dto.Dto;
import com.assessment1.serviceA.service.ServiceA;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/serviceA")
@Slf4j
public class ControllerA {

    @Autowired
    private ServiceA serviceA;

    @PostMapping
    public Dto saveEntity(@RequestBody Dto obj) {
        log.info("[ControllerA] Received request to save entity: {}", obj);

        serviceA.saveEntity(obj);

        log.info("[ControllerA] Successfully saved entity: {}", obj);
        return obj;
    }
}
