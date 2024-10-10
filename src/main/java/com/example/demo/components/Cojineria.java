package com.example.demo.components;

public abstract class Cojineria {
    // Atributos comunes (opcional)
    private int nroPieza;
    private String material;

        // Constructor por defecto
    public Cojineria() {
    }

    // Constructor (opcional)
    public Cojineria(int nroPieza, String material) {
        this.nroPieza = nroPieza;
        this.material = material;
    }

    // Métodos abstractos
    public abstract int getNroPieza();

    public abstract String getMaterial();
    
    // Métodos concretos 
    public int getNroPiezaValue() {
        return nroPieza;
    }

    public String getMaterialValue() {
        return material;
    }
}

