package co.edu.ettic.programacion;


import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

class ServicioBiblioteca {
    private List<Recurso> recursos;

    public ServicioBiblioteca() {
        this.recursos = new ArrayList<>();
    }

    public void agregar(Recurso recurso) {
        recursos.add(recurso);
    }

    public void quitar(Recurso recurso) {
        recursos.remove(recurso);
    }

    public List<Recurso> buscarRecursos(String criterio) {
        return recursos.stream()
            .filter(r -> r.coincideConCriterio(criterio))
            .collect(Collectors.toList());
    }

    public List<Recurso> obtenerTodos() {
        return new ArrayList<>(recursos);
    }
}
