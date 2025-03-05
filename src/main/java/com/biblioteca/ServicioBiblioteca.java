package com.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServicioBiblioteca {
 private List<Recurso> recursos;

    public ServicioBiblioteca() {
        this.recursos = new ArrayList<>();
    }

    public void agregarRecurso(Recurso recurso) {
        recursos.add(recurso);
    }

    public List<String> listarDisponibles() {
        return recursos.stream()
            .filter(Recurso::isDisponible)
            .map(Recurso::getTitulo)
            .collect(Collectors.toList());
    }
}
