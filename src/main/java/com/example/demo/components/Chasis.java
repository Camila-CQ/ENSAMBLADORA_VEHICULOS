package com.example.demo.components;


public abstract class Chasis {
    
    private int nroEjes;
    private int nroPieza;
    private String tipoTransmision;

    // Constructor por defecto
    public Chasis() {
    }

    public Chasis(int nroEjes, int nroPieza, String tipoTransmision) {
        this.nroEjes = nroEjes;
        this.nroPieza = nroPieza;
        this.tipoTransmision = tipoTransmision;
    }

    // Métodos abstractos
    public abstract int getNroEjes();

    public abstract int getNroPieza();

    public abstract String getTipoTransmision();

    // Métodos concretos (opcional)
    public int getNroEjesValue() {
        return nroEjes;
    }

    public int getNroPiezaValue() {
        return nroPieza;
    }

    public String getTipoTransmisionValue() {
        return tipoTransmision;
    }
}


//redactar una problematica y plantear solucion a traves del diagrama de clases utlizando patrones de diseño y en esa solucion se deben vincular al menos 3 patrones de diseño y el codigo de implementacion. PARA LA SEMANA DE PARCIALES.