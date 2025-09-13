package org.example.builder;

import java.util.Objects;

public class Usuario {
    private String nombre, email, direccion, fechaDeNacimiento, telefono;

    public Usuario() { }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getFechaDeNacimiento() { return fechaDeNacimiento; }
    public void setFechaDeNacimiento(String fechaDeNacimiento) { this.fechaDeNacimiento = fechaDeNacimiento; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', email='" + email + "', direccion='" +
                direccion + "', fechaDeNacimiento='" + fechaDeNacimiento + "', telefono='" +
                telefono + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) &&
                Objects.equals(email, usuario.email) &&
                Objects.equals(direccion, usuario.direccion) &&
                Objects.equals(fechaDeNacimiento, usuario.fechaDeNacimiento) &&
                Objects.equals(telefono, usuario.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, email, direccion, fechaDeNacimiento, telefono);
    }

    // Builder interno (sin cambios de lógica)
    public static class Builder{
        private String nombre, email, direccion, fechaDeNacimiento, telefono;

        public Builder nombre(String n) { this.nombre = n; return this; }
        public Builder email(String e) { this.email = e; return this; }
        public Builder direccion(String d) { this.direccion = d; return this; }
        public Builder fechaDeNacimiento(String f) { this.fechaDeNacimiento = f; return this; }
        public Builder telefono(String t) { this.telefono = t; return this; }

        public Usuario build() {
            Usuario u = new Usuario();
            u.nombre = nombre;
            u.email = email;
            u.direccion = direccion;
            u.fechaDeNacimiento = fechaDeNacimiento;
            u.telefono = telefono;
            return u;
        }
    }
}
