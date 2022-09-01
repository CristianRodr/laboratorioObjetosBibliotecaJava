package org.cristian.appbiblioteca.modelo;

public class Lector {

    private int id_lector;
    private Estado_Lector estadolector;
    private static int ultimoid_lector;



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
}
