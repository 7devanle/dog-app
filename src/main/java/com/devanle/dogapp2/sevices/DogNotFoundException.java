package com.devanle.dogapp2.sevices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND, reason = "Id doesnt exists here")
public class DogNotFoundException extends RuntimeException{
    public DogNotFoundException(){}

    public DogNotFoundException(String message){
        super(message);
    }
}