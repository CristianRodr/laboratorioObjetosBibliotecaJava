package org.cristian.appbiblioteca.modelo;

public enum Estado_Lector {
    HABILITADO("Habilitado"),
    MULTADO("Multado");

    private final String estadoLector;

    Estado_Lector(String estadoLector) {
        this.estadoLector = estadoLector;
    }

    public String getEstado() {
        return estadoLector;
    }
}
