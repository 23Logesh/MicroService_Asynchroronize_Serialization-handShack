package com.assessment1.serviceB.utility;

import lombok.Data; 
import org.springframework.stereotype.Component; 

@Data
@Component
public class ResponseStructure {
    //T data;
    int status;
    String message;
}