package com.example.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionService extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleExceptionCPf(Exception e) {
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered CPF " + e.getMessage() + " invalid.");
        return new ResponseEntity(uer, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<UserIdException> handleExceptionUserId(UserIdException err) {
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered invalid ID " + err.getMessage() + " invalid.");
        return new ResponseEntity(uer, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<UserNameException> handleExceptionUserName(UserNameException err) {
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered invalid USERNAME " + err.getMessage() + " invalid.");
        return new ResponseEntity(uer, HttpStatus.NOT_FOUND);
    }
}
