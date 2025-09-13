package org.example.factory;

public class LogisticaLibro {
    // Factory Method
    public static Libro crearLibro(String tipo, String titulo, String autor){
        if (tipo.equalsIgnoreCase("Fisico")){
            return new LibroFisico(titulo, autor);
        } else if (tipo.equalsIgnoreCase("Digital")){
            return new LibroDigital(titulo, autor);
        }
        throw new IllegalArgumentException("Tipo no válido: " + tipo);
    }
}
