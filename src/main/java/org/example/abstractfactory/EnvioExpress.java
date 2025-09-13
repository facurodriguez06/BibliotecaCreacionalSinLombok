package org.example.abstractfactory;

public class EnvioExpress implements MetodoEnvio{
    @Override
    public String nombre() {
        return "Envío Express";
    }

    @Override
    public void enviar(String descripcionPaquete) {
        System.out.println("[Envío Express] Procesando: " + descripcionPaquete + " (24 hs). ");
    }

}
