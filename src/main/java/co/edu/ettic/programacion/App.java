package co.edu.ettic.programacion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App 
{
    public static void main( String[] args )
    {
        ServicioBiblioteca biblioteca = new ServicioBiblioteca();
        
        biblioteca.agregar(new Libro("El Quijote", LocalDateTime.now(), true, "Cervantes", "Editorial A", 1605));
        biblioteca.agregar(new Periodico("El Tiempo", LocalDateTime.now(), true, LocalDate.of(2025, 3, 4), "Editor X"));
        biblioteca.agregar(new Computador("PC Biblioteca 1", LocalDateTime.now(), true, "HP", "Pavilion", "Windows 10"));
        
        System.out.println("\nRecursos en la biblioteca:");
        biblioteca.obtenerTodos().forEach(System.out::println);
    }
}
