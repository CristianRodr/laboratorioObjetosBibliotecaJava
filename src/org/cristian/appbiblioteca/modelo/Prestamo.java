package org.cristian.appbiblioteca.modelo;

import java.util.Date;

public class Prestamo {

    private Date f_entrega;
    private Date f_devolucion;
    private boolean multa;

    public Prestamo(Date f_entrega, Date f_devolucion, boolean multa) {
        this.f_entrega = f_entrega;
        this.f_devolucion = f_devolucion;
        this.multa = multa;
    }

    public Date getF_entrega() {
        return f_entrega;
    }

    public void setF_entrega(Date f_entrega) {
        this.f_entrega = f_entrega;
    }

    public Date getF_devolucion() {
        return f_devolucion;
    }

    public void setF_devolucion(Date f_devolucion) {
        this.f_devolucion = f_devolucion;
    }

    public boolean isMulta() {
        return multa;
    }

    public void setMulta(boolean multa) {
        this.multa = multa;
    }
}
