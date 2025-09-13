package org.example.abstractfactory;

public class UsuarioFactory implements AbstractFactory{
    @Override
    public InterfazUI crearUI() {
        return new UsuarioUI();
    }

    @Override
    public MetodoEnvio crearMetodoEnvio() {
        return new EnvioNormal(); //Usuario Normal con envío estándar
    }
}
