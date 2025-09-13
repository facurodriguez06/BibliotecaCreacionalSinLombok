package org.example.abstractfactory;

public class UsuarioUI implements InterfazUI{

    @Override
    public void mostrar() {
        System.out.println("Mostrando interfaz de Usuario Estándar");
    }

    @Override
    public String tipoUI() {
        return "UI de Usuario Estándar";
    }
}
