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
        Copia copiathree = new Copia(3, "Eugénie Grandet la comedia humana", Tipo_Libro.ENSAYO, "Unidad Editorial", 1999, Tipo_Estado.ENBIBLIOTECA);


        //System.out.println(bookOne.detalle());
        //System.out.println(bookTwo.detalle());
        //System.out.println(bookthree.detalle());
        System.out.println(copiaOne.verDetalle());
        System.out.println(copiaTwo.verDetalle());
        System.out.println(copiathree.verDetalle());




    }
}
