package dev.patika.vetapp.v1.core.exception.exception;

public class NotFoundAppointment extends RuntimeException{
    public NotFoundAppointment(String message) {
        super(message);
    }
}
