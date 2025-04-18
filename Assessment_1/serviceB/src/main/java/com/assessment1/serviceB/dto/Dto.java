package com.assessment1.serviceB.dto;

import lombok.Data;

@Data
public class Dto {
	int id;
	String message;
	
	@Override
	public String toString() {
	    return "{ \"id\": " + id + ", \"message\": \"" + message + "\" }";
	}
}
