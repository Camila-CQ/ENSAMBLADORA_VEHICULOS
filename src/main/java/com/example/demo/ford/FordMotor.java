package com.example.demo.ford;

import com.example.demo.components.Motor;

public class FordMotor extends Motor {
    public FordMotor(int potenciaMax, int nroPieza, String tecnologiaMotor) {
        super(potenciaMax, nroPieza, tecnologiaMotor); // Llama al constructor de la clase Motor
    }

    @Override
    public int getPotenciaMax() {
        return this.potenciaMax; // Accede directamente al atributo potenciaMax
    }

    @Override
    public int getNroPieza() {
        return this.nroPieza; // Accede directamente al atributo nroPieza
    }

    @Override
    public String getTecnologiaMotor() {
        return this.tecnologiaMotor; // Accede directamente al atributo tecnologiaMotor
    }
}
