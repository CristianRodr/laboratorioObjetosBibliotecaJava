package org.cristian.appbiblioteca;

import org.cristian.appbiblioteca.modelo.Autor;
import org.cristian.appbiblioteca.modelo.Copia;
import org.cristian.appbiblioteca.modelo.Libro;
import org.cristian.appbiblioteca.modelo.Tipo_Libro;

import java.time.LocalDate;
import java.util.Date;

public class Biblioteca {
    public static void main(String[] args) {

        Autor autor01 = new Autor("Gabriel Garcia Marques", "Colombiana", new Date(1927,3,6));
        Autor autor02 = new Autor("Juan Rulfo", "Mexicano", new Date(1917, 5, 16));

        Libro bookOne = new Libro("100 años de Soledad", Tipo_Libro.NOVELA, "Círculo de lectores", 1985);
        Libro bookTwo = new Libro("Crimen Y Castigo", Tipo_Libro.POESIA, "Alma", 2021);
        Libro bookthree = new Libro("Eugénie Grandet la comedia humana", Tipo_Libro.ENSAYO, "Unidad Editorial", 1999);

        System.out.println(bookOne.detalle());
        System.out.println(bookTwo.detalle());
        System.out.println(bookthree.detalle());


    }
}
