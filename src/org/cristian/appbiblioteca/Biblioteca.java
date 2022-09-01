package org.cristian.appbiblioteca;

import org.cristian.appbiblioteca.modelo.Libro;
import org.cristian.appbiblioteca.modelo.Tipo_Libro;

public class Biblioteca {
    public static void main(String[] args) {

        Libro bookOne = new Libro("100 años de Soledad", Tipo_Libro.NOVELA, "Círculo de lectores", 1985);

        Libro bookTwo = new Libro("Crimen Y Castigo", Tipo_Libro.POESIA, "Alma", 2021);

        System.out.println(bookOne.detalle());
        System.out.println(bookTwo.detalle());
    }
}
