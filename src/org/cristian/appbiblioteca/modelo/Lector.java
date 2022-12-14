package org.cristian.appbiblioteca.modelo;

public class Lector {

    private String nombreLector;
    private int id_lector;
    private Estado_Lector estadolector;
    private static int ultimoid_lector;

    public Lector(int id_lector, Estado_Lector estadolector) {
        this.id_lector = id_lector;
        this.estadolector = estadolector;
    }

    public Lector(int id_lector) {
        this.id_lector = ++ultimoid_lector;
    }

    public static int getUltimoid_lector() {
        return ultimoid_lector;
    }

    public Estado_Lector getEstadolector() {
        return estadolector;
    }

    public void setEstadolector(Estado_Lector estadolector) {
        this.estadolector = estadolector;
    }

    public String getNombreLector() {
        return nombreLector;
    }

    public void setNombreLector(String nombreLector) {
        this.nombreLector = nombreLector;
    }
}
