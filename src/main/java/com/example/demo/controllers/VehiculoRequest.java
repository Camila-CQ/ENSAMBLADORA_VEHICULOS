package com.example.demo.controllers;

public class VehiculoRequest {
    private String marca;
    private String color;
    private int nroEjes;
    private int nroPiezaChasis;
    private String tipoTransmision;
    private int potenciaMax;
    private int nroPiezaMotor;
    private String tecnologiaMotor;
    private int nroPiezaCojineria;
    private String materialCojineria;


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNroEjes() {
        return nroEjes;
    }
    public void setNroEjes(int nroEjes) {
        this.nroEjes = nroEjes;
    }
    public int getNroPiezaChasis() {
        return nroPiezaChasis;
    }
    public void setNroPiezaChasis(int nroPiezaChasis) {
        this.nroPiezaChasis = nroPiezaChasis;
    }
    public String getTipoTransmision() {
        return tipoTransmision;
    }
    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
    public int getPotenciaMax() {
        return potenciaMax;
    }
    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }
    public int getNroPiezaMotor() {
        return nroPiezaMotor;
    }
    public void setNroPiezaMotor(int nroPiezaMotor) {
        this.nroPiezaMotor = nroPiezaMotor;
    }
    public String getTecnologiaMotor() {
        return tecnologiaMotor;
    }
    public void setTecnologiaMotor(String tecnologiaMotor) {
        this.tecnologiaMotor = tecnologiaMotor;
    }
    public int getNroPiezaCojineria() {
        return nroPiezaCojineria;
    }
    public void setNroPiezaCojineria(int nroPiezaCojineria) {
        this.nroPiezaCojineria = nroPiezaCojineria;
    }
    public String getMaterialCojineria() {
        return materialCojineria;
    }
    public void setMaterialCojineria(String materialCojineria) {
        this.materialCojineria = materialCojineria;
    }

    // Getters y Setters
    // (Implementa aquí los getters y setters para cada atributo)
}
