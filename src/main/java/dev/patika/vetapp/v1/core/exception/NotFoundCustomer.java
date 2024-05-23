package dev.patika.vetapp.v1.core.exception;

public class NotFoundCustomer extends RuntimeException{
    public NotFoundCustomer(String message) {
        super(message);
    }
}
