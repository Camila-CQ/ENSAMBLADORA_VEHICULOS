package com.example.demo.components;


public abstract class Motor {
    protected int potenciaMax;
    protected int nroPieza;
    protected String tecnologiaMotor;

    public Motor() {}

    public Motor(int potenciaMax, int nroPieza, String tecnologiaMotor) {
        this.potenciaMax = potenciaMax;
        this.nroPieza = nroPieza;
        this.tecnologiaMotor = tecnologiaMotor;
    }

    // Métodos abstractos
    public abstract int getPotenciaMax();
    public abstract int getNroPieza();
    public abstract String getTecnologiaMotor();

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    public void setNroPieza(int nroPieza) {
        this.nroPieza = nroPieza;
    }

    public void setTecnologiaMotor(String tecnologiaMotor) {
        this.tecnologiaMotor = tecnologiaMotor;
    }
}