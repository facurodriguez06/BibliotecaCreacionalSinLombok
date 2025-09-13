package org.example.abstractfactory;


public interface AbstractFactory {
    InterfazUI crearUI(); //Creamos la UI dependiendo del rol que le asignaremos
    MetodoEnvio crearMetodoEnvio(); //Creamos el envío con el tipo correspondiente
}
