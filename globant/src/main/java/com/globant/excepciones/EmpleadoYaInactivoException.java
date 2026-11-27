package com.globant.excepciones;

public class EmpleadoYaInactivoException extends Exception {
    public EmpleadoYaInactivoException(String msg) {
        super(msg);
    }
}
