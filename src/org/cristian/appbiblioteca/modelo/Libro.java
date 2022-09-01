package org.cristian.appbiblioteca.modelo;

public class Libro {

    private String titulo;
    private Tipo_Libro tipo;
    private String editorial;
    private int año;

    public Libro(String titulo, Tipo_Libro tipo, String editorial, int año) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.editorial = editorial;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tipo_Libro getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_Libro tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTitulo = " + this.getTitulo());
        sb.append("\nTipo de libro = " + this.getTipo());
        sb.append("\nEditorial = " + this.editorial);
        sb.append("\naño = " + this.año);
        sb.append("\n-------------------------------");
        return sb.toString();
    }
}
