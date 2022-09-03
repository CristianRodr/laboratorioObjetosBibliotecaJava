package org.cristian.appbiblioteca.modelo;

public class Autor {

    String nombre;
    String nacionalidad;
    String fecha;


    public Autor(String nombre, String nacionalidad, String fecha) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


}
