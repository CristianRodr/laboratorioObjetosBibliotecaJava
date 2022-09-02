package org.cristian.appbiblioteca.modelo;

import java.util.Date;

public class Autor {

    String nombre;
    String nacionalidad;
    Date fecha;


    public Autor(String nombre, String nacionalidad, Date fecha) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


}
