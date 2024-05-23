package dev.patika.vetapp.v1.core.config;

import dev.patika.vetapp.v1.core.exception.NotFoundAnimal;
import dev.patika.vetapp.v1.core.exception.NotFoundCustomer;
import dev.patika.vetapp.v1.core.result.Result;
import dev.patika.vetapp.v1.core.utilites.ResulHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandleException {

    @ExceptionHandler(NotFoundCustomer.class)
    public ResponseEntity<Result> handleNotFoundCustomerException(){
        return new ResponseEntity<>(ResulHelper.NOT_FOUND_CUSTOMER(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundAnimal.class)
    public ResponseEntity<Result> handleNotFoundAnimalException(){
        return new ResponseEntity<>(ResulHelper.NOT_FOUND_CUSTOMER(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
