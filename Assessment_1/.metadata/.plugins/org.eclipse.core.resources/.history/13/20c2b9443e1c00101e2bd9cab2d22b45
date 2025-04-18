package com.assessment1.serviceA.serviceImp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assessment1.serviceA.dto.Dto;
import com.assessment1.serviceA.entity.Entity;
import com.assessment1.serviceA.repository.Repository;
import com.assessment1.serviceA.service.ServiceA;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ServiceAImp implements ServiceA {

    @Autowired
    private Repository repository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Dto saveEntity(Dto obj) {
        log.info("[ServiceA] Saving entity: {}", obj);

        repository.save(convertDtoToEntity(obj));
        log.info("[ServiceA] Entity saved to repository: {}", obj);

        Dto response = restTemplate.postForEntity("http://localhost:8082/serviceB", obj, Dto.class).getBody();
        log.info("[ServiceA] Response from ServiceB: {}", response);

        return response;
    }

    Entity convertDtoToEntity(Dto dto) {
        return modelMapper.map(dto, Entity.class);
    }

    Dto convertEntityToDto(Entity entity) {
        return modelMapper.map(entity, Dto.class);
    }
}
