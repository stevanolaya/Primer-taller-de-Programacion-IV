package com.biblioteca;

class Libro extends Recurso {
    private String autor;

    public Libro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }
}