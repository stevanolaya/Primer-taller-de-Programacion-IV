package co.edu.ettic.programacion;

import java.time.LocalDateTime;

class Libro extends Recurso {
    private String autor;
    private String editorial;
    private int anio;

    public Libro(String nombre, LocalDateTime fechaIngreso, boolean activo, String autor, String editorial, int anio) {
        super(nombre, fechaIngreso, activo);
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAnio() {
        return anio;
    }
}