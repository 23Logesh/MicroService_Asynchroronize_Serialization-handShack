package com.assessment1.serviceB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment1.serviceB.entity.Entity;

public interface RepositoryB extends JpaRepository<Entity, Integer> {

}
