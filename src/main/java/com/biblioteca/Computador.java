package com.biblioteca;

class Computador extends Recurso {
    private String id;

    public Computador(String titulo, String id) {
        super(titulo);
        this.id = id;
    }
}