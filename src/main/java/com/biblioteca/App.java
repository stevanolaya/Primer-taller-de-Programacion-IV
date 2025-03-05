package com.biblioteca;
public class App 
{
    public static void main( String[] args )
    {
        ServicioBiblioteca biblioteca = new ServicioBiblioteca();
        
        biblioteca.agregarRecurso(new Libro("El Quijote", "Cervantes"));
        biblioteca.agregarRecurso(new Periodico("El Tiempo", "04-03-2025"));
        biblioteca.agregarRecurso(new Computador("PC Biblioteca 1", "001"));
        
        System.out.println("Recursos disponibles: " + biblioteca.listarDisponibles());
    }
}
