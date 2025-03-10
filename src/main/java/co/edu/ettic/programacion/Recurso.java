package co.edu.ettic.programacion;

import java.time.LocalDateTime;

abstract class Recurso {
    private String nombre;
    private LocalDateTime fechaIngreso;
    private boolean activo;

    public Recurso(String nombre, LocalDateTime fechaIngreso, boolean activo) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void darDeBaja() {
        this.activo = false;
    }

    public boolean coincideConCriterio(String criterio) {
        return nombre.toLowerCase().contains(criterio.toLowerCase());
    }

    @Override
    public String toString() {
        return "Recurso: " + nombre + ", Ingreso: " + fechaIngreso + ", Activo: " + activo;
    }
}