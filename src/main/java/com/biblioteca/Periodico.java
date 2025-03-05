package com.biblioteca;

class Periodico extends Recurso {
    private String fechaPublicacion;

    public Periodico(String titulo, String fechaPublicacion) {
        super(titulo);
        this.fechaPublicacion = fechaPublicacion;
    }
}

