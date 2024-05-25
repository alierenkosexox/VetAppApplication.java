package dev.patika.vetapp.v1.core.exception.exception;

public class NotFoundObjectRequest extends RuntimeException{
    public NotFoundObjectRequest(String message) {
        super(message);
    }
}
