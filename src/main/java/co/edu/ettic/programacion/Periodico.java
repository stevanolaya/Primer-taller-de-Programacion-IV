package co.edu.ettic.programacion;

import java.time.LocalDateTime;
import java.time.LocalDate;

class Periodico extends Recurso {
    private LocalDate fechaPublicacion;
    private String editorial;

    public Periodico(String nombre, LocalDateTime fechaIngreso, boolean activo, LocalDate fechaPublicacion, String editorial) {
        super(nombre, fechaIngreso, activo);
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }
}
