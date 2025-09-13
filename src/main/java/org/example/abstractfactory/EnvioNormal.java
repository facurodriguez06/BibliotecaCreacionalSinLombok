package org.example.abstractfactory;

public class EnvioNormal implements MetodoEnvio{
    @Override
    public String nombre() {
        return "Envío Normal";
    }

    @Override
    public void enviar(String descripcionPaquete) {
        System.out.println("[Envío Normal] Procesando: " + descripcionPaquete + " (48 - 72 hs). ");
    }

}
