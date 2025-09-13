package org.example.abstractfactory;

public class AdminFactory implements AbstractFactory{
    @Override
    public InterfazUI crearUI() {
        return new AdminUI();
    }

    @Override
    public MetodoEnvio crearMetodoEnvio() {
        return new EnvioExpress(); //Imaginamos que hay una regla de negocio en la que el envío de admin es express
    }
}
