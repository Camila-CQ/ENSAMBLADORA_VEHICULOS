package com.example.demo.toyota;

import com.example.demo.components.Motor;

public class ToyotaMotor extends Motor {
    public ToyotaMotor(int potenciaMax, int nroPieza, String tecnologiaMotor) {
        super(potenciaMax, nroPieza, tecnologiaMotor); // Llama al constructor de la clase Motor
    }

    @Override
    public int getPotenciaMax() {
        return this.potenciaMax;
    }

    @Override
    public int getNroPieza() {
        return this.nroPieza;
    }

    @Override
    public String getTecnologiaMotor() {
        return this.tecnologiaMotor;
    }
}
