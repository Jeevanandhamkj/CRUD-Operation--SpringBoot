package com.example.CrudExample.ExceptionHandler;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionDemo {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> exmeth(MethodArgumentNotValidException e){
        Map<String,String>errormap=new HashMap<>();
        errormap.put("error","MethodArgumentNotValidException");
        errormap.put("message","check your input field");
        return errormap;
    }
}
