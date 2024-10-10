package com.example.demo.toyota;

import com.example.demo.components.Cojineria;

public class ToyotaCojineria extends Cojineria {
    public ToyotaCojineria(int nroPieza, String material) {
        super(nroPieza, material); // Llama al constructor de la clase Cojineria
    }

    @Override
    public int getNroPieza() {
        return super.getNroPiezaValue();
    }

    @Override
    public String getMaterial() {
        return super.getMaterialValue();
    }
}
