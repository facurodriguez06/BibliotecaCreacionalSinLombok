package org.example.abstractfactory;

public class AdminUI implements InterfazUI {
    @Override
    public void mostrar() {
        System.out.println("Mostrando Interfaz de Administrador");
    }

    @Override
    public String tipoUI() {
        return "UI de Administrador";
    }
}
