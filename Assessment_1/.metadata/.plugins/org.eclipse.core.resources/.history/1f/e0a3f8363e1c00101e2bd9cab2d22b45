package com.assessment1.serviceC.serviceImp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment1.serviceC.dto.Dto;
import com.assessment1.serviceC.entity.Entity;
import com.assessment1.serviceC.repository.RepositoryC;
import com.assessment1.serviceC.service.ServiceC;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ServiceCImp implements ServiceC {

    @Autowired
    private RepositoryC repo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveEntity(String message) {
        log.info("[ServiceC] Received message for processing.");

        ObjectMapper objectMapper = new ObjectMapper();
        Dto obj = null;

        try {
            obj = objectMapper.readValue(message, Dto.class);
        } catch (JsonProcessingException e) {
            log.error("[ServiceC] Failed to deserialize message: {}", message, e);
            return;
        }

        Entity entity = convertDtoToEntity(obj);
        if (entity == null) {
            log.warn("[ServiceC] DTO conversion resulted in null. Save aborted.");
            return;
        }

        repo.save(entity);
        log.info("[ServiceC] Entity saved to database.");
    }

    Entity convertDtoToEntity(Dto dto) {
        if (dto == null) return null;
        return modelMapper.map(dto, Entity.class);
    }
}
