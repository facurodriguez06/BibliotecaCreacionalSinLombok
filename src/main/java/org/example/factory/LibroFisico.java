package org.example.factory;

import java.util.Objects;

public class LibroFisico implements Libro {
    private String titulo;
    private String autor;

    public LibroFisico() { }

    public LibroFisico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    @Override
    public String getDescripcion() {
        return "Libro Fisico - " + titulo + " de " + autor;
    }

    @Override
    public String toString() {
        return "LibroFisico{titulo='" + titulo + "', autor='" + autor + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroFisico)) return false;
        LibroFisico that = (LibroFisico) o;
        return Objects.equals(titulo, that.titulo) &&
                Objects.equals(autor, that.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }
}
