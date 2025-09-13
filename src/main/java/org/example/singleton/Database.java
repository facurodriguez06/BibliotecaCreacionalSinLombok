package org.example.singleton;
import org.example.factory.Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Database {
    private static Database instance; //Con esta variable estática vamos a simular la única instancia
    private List<Libro> libros; //Con esta lista simualmos la base de datos
    private Database(){
        libros = new ArrayList<>();
    }
    public static synchronized Database getInstance(){ //Con este método vamos a obtener la única instancia
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }
    //Agregamos métodos para manipular libros
    public void agregarLibros(Libro libro){
        libros.add(libro);
    }

    public List<Libro> getLibros(){
        return libros;
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros cargados");
        } else {
            for (Libro l : libros) {
                System.out.println(l);
            }
        }

    }


}
