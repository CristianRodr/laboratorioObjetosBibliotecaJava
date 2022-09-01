package org.cristian.appbiblioteca.modelo;

public class Libro {

    private String titulo;
    private Tipo_Libro tipo;
    private String editorial;
    private int año;

    private Autor autor;

    public Libro(String titulo, Tipo_Libro tipo, String editorial, int año, Autor autor) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.editorial = editorial;
        this.año = año;
        this.autor = autor;
    }

    public Libro() {

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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTitulo = " + this.getTitulo());
        sb.append("\nTipo de libro = " + this.getTipo());
        sb.append("\nEditorial = " + this.editorial);
        sb.append("\naño = " + this.año);
        sb.append("\autor = " + this.autor.getNombre());
        sb.append("\n-------------------------------");
        return sb.toString();
    }

    public String detalle() {
        String detall = "\nauto.id = " + this.id +
                "\nauto.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo();

        if (this.getTipo() != null) {
            detall += "\nauto.tipo + " + this.getTipo().getDescripcion();
        }

        detall += "\nauto.color = " + this.color +
                "\nauto.patenteColor + " + colorPatente;

        if (this.motor != null) {
            detall += "\nauto.cilindrada = " + this.motor.getCilindrada();
        }

        if (conductor != null) {
            detall += "Conductor subaru: " + this.getConductor();
        }
        if (getRuedas() != null) {
            detall += "\nRuedas del automovil: ";
            for (Rueda r :
                    this.getRuedas()) {
                detall += "\n" + r.getFabricante() + ", aro: " + r.getAro() + ", ancho:  " + r.getAncho();
            }
        }

        System.out.println("----------------------------------------------");

        return detall;
    }
}
