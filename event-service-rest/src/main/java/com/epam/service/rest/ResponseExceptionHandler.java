package com.epam.service.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler({RuntimeException.class})
  public ResponseEntity<Object> handleNotFoundException(Exception exception, WebRequest request) {
    return new ResponseEntity<>("Error: " + exception.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
  }

}
