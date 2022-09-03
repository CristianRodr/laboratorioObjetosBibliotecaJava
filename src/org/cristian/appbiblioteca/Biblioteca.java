package org.cristian.appbiblioteca;

import org.cristian.appbiblioteca.modelo.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {


        Libro bookOne = new Libro("100 años de Soledad", Tipo_Libro.NOVELA, "Círculo de lectores", 1985);
        Libro bookTwo = new Libro("Crimen Y Castigo", Tipo_Libro.POESIA, "Alma", 2021);
        Libro bookthree = new Libro("Eugénie Grandet la comedia humana", Tipo_Libro.ENSAYO, "Unidad Editorial", 1999);

        Copia copiaOne = new Copia(1,"100 años de Soledad", Tipo_Libro.NOVELA, "Círculo de lectores", 1985, Tipo_Estado.PRESTADA );
        Copia copiaTwo = new Copia(2, "Crimen Y Castigo", Tipo_Libro.POESIA, "Alma", 2021, Tipo_Estado.RETRASO);
        Copia copiathree = new Copia(3, " Eugénie Grandetla comedia humana", Tipo_Libro.ENSAYO, "Unidad Editorial", 1999, Tipo_Estado.ENBIBLIOTECA);

        Libro autorUno = new Libro("Gabriel Garcia Marquez", "Aracataca(Magdalena)", "6 de marzo de 1927");
        Libro autorTwo = new Libro("Fiodor Mijaïlovich Dostoevskiï", "Moscu", "11 de Noviembre de 1821");
        Libro autorthree = new Libro(" Honoré de Balzac", "Paris", "20 deMayo de 1799");

        System.out.println(copiaOne.verDetalle());
        System.out.println(copiaTwo.verDetalle());
        System.out.println(copiathree.verDetalle());
        System.out.println(autorUno.escrito(bookOne.getTitulo()));
        System.out.println(autorTwo.escrito(bookTwo.getTitulo()));
        System.out.println(autorthree.escrito(bookthree.getTitulo()));




    }
}
