package com.example.demo.ford;

import com.example.demo.components.Cojineria;

public class FordCojineria extends Cojineria {
    public FordCojineria(int nroPieza, String material) {
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
