package org.cristian.appbiblioteca.modelo;

public enum Tipo_Estado {
    PRESTADA("Prestada"),
    ENBIBLIOTECA("En biblioteca"),
    RETRASO("Retraso"),
    REPARACION("Reparacion");

    private final String tipoEstado;

    Tipo_Estado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public String getTipoEstado() {
        return tipoEstado;
    }

    @Override
    public String toString() {
        return this.tipoEstado;
    }
}
