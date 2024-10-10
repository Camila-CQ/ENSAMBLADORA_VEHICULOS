package com.example.demo.mazda;

import com.example.demo.components.Motor;

public class MazdaMotor extends Motor {
    public MazdaMotor(int potenciaMax, int nroPieza, String tecnologiaMotor) {
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
