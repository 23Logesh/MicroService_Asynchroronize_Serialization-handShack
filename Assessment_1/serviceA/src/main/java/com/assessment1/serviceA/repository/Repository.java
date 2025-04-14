package com.assessment1.serviceA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment1.serviceA.entity.Entity;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Entity, Integer> {

}
