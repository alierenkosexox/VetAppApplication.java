package dev.patika.vetapp.v1.core.exception.exception;

public class NotFoundDoctorException extends RuntimeException{
    public NotFoundDoctorException(String message) {
        super(message);
    }
}
