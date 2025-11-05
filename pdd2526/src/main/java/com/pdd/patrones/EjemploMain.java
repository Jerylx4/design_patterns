package com.pdd.patrones;

import com.pdd.patrones.db.ConexionDb;
import com.pdd.patrones.db.PersonaCrud;
import com.pdd.patrones.modelo.Persona;

import java.util.Optional;

public class EjemploMain {

    public static void main(String[] args) {

        PersonaCrud personaCrud = new PersonaCrud();

        //Optional<Persona> per;

        personaCrud.buscar(1)
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("Persona no encontrada"));

    }

}
