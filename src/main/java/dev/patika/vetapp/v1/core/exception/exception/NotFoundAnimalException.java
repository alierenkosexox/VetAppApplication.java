package dev.patika.vetapp.v1.core.exception.exception;

public class NotFoundAnimalException extends RuntimeException{
    public NotFoundAnimalException(String message) {
        super(message);
    }
}
