package org.cristian.appbiblioteca.modelo;

public class Copia extends Libro{

    private int id_Copia;
    private Tipo_Estado estado;
    private static int ultimoid_copia;

    public Copia(int id_Copia) {
        super();
        this.id_Copia = ++ultimoid_copia;
    }

    public Copia(String titulo, Tipo_Libro tipo, String editorial, int año) {
        super(titulo, tipo, editorial, año);
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
}
