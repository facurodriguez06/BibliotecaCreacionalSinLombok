package org.example.prototype;

import java.util.Objects;

public class Prestamo implements Cloneable {
    private String libro, usuario, fechaInicio, fechaFin;

    public Prestamo() { }

    public Prestamo(String libro, String usuario, String fechaInicio, String fechaFin) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y Setters
    public String getLibro() { return libro; }

    public void setLibro(String libro) { this.libro = libro; }


    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }

    public String getFechaFin() { return fechaFin; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }

    @Override
    public Prestamo clone(){
        try {
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException("No debería pasar: " + e);
        }
    }

    public void mostrar(){
        System.out.println(usuario + " solicita un préstamo del libro: " + libro +
                ", desde el " + fechaInicio + " hasta el " + fechaFin);
    }

    @Override
    public String toString() {
        return "Prestamo{libro='" + libro + "', usuario='" + usuario + "', fechaInicio='" +
                fechaInicio + "', fechaFin='" + fechaFin + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prestamo)) return false;
        Prestamo that = (Prestamo) o;
        return Objects.equals(libro, that.libro) &&
                Objects.equals(usuario, that.usuario) &&
                Objects.equals(fechaInicio, that.fechaInicio) &&
                Objects.equals(fechaFin, that.fechaFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro, usuario, fechaInicio, fechaFin);
    }
}
