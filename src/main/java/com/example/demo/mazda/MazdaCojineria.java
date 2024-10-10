package com.example.demo.mazda;

import com.example.demo.components.Cojineria;

public class MazdaCojineria extends Cojineria {
    public MazdaCojineria(int nroPieza, String material) {
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
