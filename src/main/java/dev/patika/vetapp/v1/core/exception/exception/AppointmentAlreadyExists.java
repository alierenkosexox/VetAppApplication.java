package dev.patika.vetapp.v1.core.exception.exception;

public class AppointmentAlreadyExists extends RuntimeException{
    public AppointmentAlreadyExists(String message) {
        super(message);
    }
}
