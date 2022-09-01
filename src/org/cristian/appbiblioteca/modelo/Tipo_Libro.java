package org.cristian.appbiblioteca.modelo;

public enum Tipo_Libro {
    NOVELA("Novela"),
    TEATRO("Teatro"),
    POESIA("Poesia"),
    ENSAYO("Ensayo");

    private final  String tipoLibro;

    Tipo_Libro(String tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

    public String getTipo() {
        return tipoLibro;
    }

    @Override
    public String toString() {
        return this.tipoLibro;
    }
}
