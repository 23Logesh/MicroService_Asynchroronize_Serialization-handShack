package com.assessment1.serviceB.entity;


import jakarta.persistence.Id;
import lombok.Data;

@Data
@jakarta.persistence.Entity
public class Entity  {
	@Id
	int id;
	String message;

}
