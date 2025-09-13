package org.example.factory;

import java.util.Objects;

public class LibroDigital implements Libro {
    private String titulo;
    private String autor;

    public LibroDigital() { }

    public LibroDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    @Override
    public String getDescripcion() {
        return "Libro Digital - " + titulo + " de " + autor;
    }

    @Override
    public String toString() {
        return "LibroDigital{titulo='" + titulo + "', autor='" + autor + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroDigital)) return false;
        LibroDigital that = (LibroDigital) o;
        return Objects.equals(titulo, that.titulo) &&
                Objects.equals(autor, that.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }
}
