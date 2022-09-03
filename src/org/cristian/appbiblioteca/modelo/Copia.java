package org.cristian.appbiblioteca.modelo;

public class Copia extends Libro{

    private int id_Copia;
    private Tipo_Estado estado;
    private static int ultimoid_copia;


    public Copia(int id_Copia) {
        super();
        this.id_Copia = ++ultimoid_copia;
    }

    public Copia(int id_Copia, String titulo, Tipo_Libro tipo, String editorial, int año, Tipo_Estado estado) {
        super(titulo, tipo, editorial, año);
        this.id_Copia = id_Copia;
        this.estado = estado;
    }


    public void setId_Copia(int id_Copia) {
        this.id_Copia = id_Copia;
    }

    public static int getUltimoid_copia() {
        return ultimoid_copia;
    }

    public int getId_Copia() {
        return id_Copia;
    }

    public Tipo_Estado getEstado() {
        return estado;
    }

    public void setEstado(Tipo_Estado estado) {
        this.estado = estado;
    }

    public String verDetalle() {
        return "\nid = " + this.id_Copia +
                "\nTitulo = " + this.getTitulo() +
                "\nTipo de libro = " + this.getTipo() +
                "\nEditorial = " + this.getEditorial() +
                "\naño = " + this.getAño() +
                "\nEstado = " + this.estado +
                "\n-------------------------------";
    }

}
