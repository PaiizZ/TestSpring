package com.example.test.controller;

import com.example.test.exception.NotFoundException;
import com.example.test.model.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorModel> notFoundExceptionHandler(NotFoundException exception){
        ErrorModel errorModel = new ErrorModel();
        errorModel.setCode(exception.getErrorCode());
        errorModel.setDescription(exception.getErrorDescription());
        return new ResponseEntity<>(errorModel, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity exceptionHandler(Exception exception){
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
