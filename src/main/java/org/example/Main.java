package org.example;

import org.example.abstractfactory.*;
import org.example.factory.*;
import org.example.singleton.*;
import org.example.builder.*;
import org.example.prototype.*;

public class Main {
    public static void main(String[] args) {
        //Singleton
        System.out.println("=====SINGLETON=====");
        //Obtenemos dos instancias de DATABASE
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        //Agregamos libros desde db1
        db1.agregarLibros(new LibroDigital("Las 48 Leyes del Poder", "Robert Greene"));
        db1.agregarLibros(new LibroFisico("El Arte de la Seducción", "Robert Greene"));


        //Listamos los libros desde db2 (deberían aparecer los mismos que en db1)
        db2.listarLibros();

        System.out.println("¿db1 y db2 son las mismas instancias?" + (db1 == db2)); //Debería devolver "true" si son las mismas insatncias
        System.out.println();

        //Factory Method
        System.out.println("=====FACTORY METHOD=====");
        //Creanos libros a través del método Factory Method
        Libro libro1 = LogisticaLibro.crearLibro("Digital", "El Principito", "Antoine de Saint-Exupéry");
        Libro libro2 = LogisticaLibro.crearLibro("Fisico", "El Secreto", "Rhonda Bryne");

        //Mostramos los libros por consola
        System.out.println(libro1.getDescripcion());
        System.out.println(libro2.getDescripcion());
        System.out.println();

        //Abstract Factory
        System.out.println("=====ABSTRACT FACTORY=====");
        //Creamos un usuario Admin
        AbstractFactory fAdmin = new AdminFactory();
        InterfazUI uiAdmin = fAdmin.crearUI();
        MetodoEnvio envioAdmin = fAdmin.crearMetodoEnvio();

        //Mostramos por consola información del admin creado
        System.out.println("===ADMIN===");
        System.out.println("UI: " + uiAdmin.tipoUI());
        uiAdmin.mostrar();
        System.out.println("Método: " + envioAdmin.nombre());
        envioAdmin.enviar("Pedido #A-6602");
        System.out.println();

        //Creamos un usuario normal
        AbstractFactory fUsuario = new UsuarioFactory();
        InterfazUI uiUsuario = fUsuario.crearUI();
        MetodoEnvio envioUsuario = fUsuario.crearMetodoEnvio();

        //Mostramos Información de Usuario Estándar por Consola
        System.out.println("===USUARIO ESTÁNDAR===");
        System.out.println("UI: " + uiUsuario.tipoUI());
        uiUsuario.mostrar();
        System.out.println("Método: " + envioUsuario.nombre());
        envioUsuario.enviar("Pedido #S-1034");
        System.out.println();

        //Builder
        System.out.println("=====BUILDER=====");
        //Creamos el primer usuario
        Usuario u1 = new Usuario.Builder()
                .nombre("Facundo Rodriguez")
                .email("facundorodriguezsp@gmail.com")
                .direccion("La Capilla 3520")
                .fechaDeNacimiento("6 de Octubre de 2002")
                .telefono("2614994711")
                .build();

        //Creamos el segundo usuario
        Usuario u2 = new Usuario.Builder()
                .nombre("Lautaro Sosa")
                .email("lautisosa@gmail.com")
                .direccion("Coronel Rodriguez 2332")
                .fechaDeNacimiento("7 de Enero de 2005")
                .telefono("2634877314")
                .build();

        // Mostramos la info por consola
        System.out.println("Usuario 1: " + u1);
        System.out.println("Usuario 2: " + u2);
        System.out.println();

        //Prototype
        System.out.println("=====PROTOTYPE=====");
        //Creamos el primer préstamo y lo tomamos de base para luego clonarlo
        Prestamo prototipo = new Prestamo("Harry Potter", "Luciano Romero", "22 de Agosto del 2025", "30 de Agosto del 2025");

        //Clonamos el primer préstamo
        Prestamo copia1 = prototipo.clone();
        copia1.setLibro("Cien Años de Soledad");
        copia1.setFechaFin("10 de Septiembre del 2025");

        //Clonamos el segundo préstamo
        Prestamo copia2 = prototipo.clone();
        copia2.setUsuario("Nicolas Diaz");
        copia2.setFechaInicio("25 de Agosto del 2025");
        copia2.setFechaFin("03 de Septiembre del 2025");

        Prestamo copia3 = prototipo.clone();

        //Mostramos los datos del préstamos "prototipo" y de los clones
        prototipo.mostrar();
        copia1.mostrar();
        copia2.mostrar();

        //Como algo extra podemos realizar algunos chequeos comparando atributos
        System.out.println("¿Prototipo y copia1 comparten el mismo libro?: " + (prototipo.getLibro() == copia1.getLibro()));
        System.out.println("¿Prototipo y copi2 comparten la misma fecha de fin?: " + (prototipo.getFechaFin() == copia2.getFechaFin()));
        System.out.println("¿Prototipo y copia3 son la misma instancia?: " + (prototipo == copia3));


    }
}
