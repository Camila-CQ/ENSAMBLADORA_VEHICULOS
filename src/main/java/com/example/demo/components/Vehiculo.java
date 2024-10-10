package com.example.demo.components;

public class Vehiculo {
    private String marca;
    private String color;
    private Chasis chasis;
    private Motor motor;
    private Cojineria cojineria;

    // Constructor
    public Vehiculo(String marca, String color, Chasis chasis, Motor motor, Cojineria cojineria) {
        this.marca = marca;
        this.color = color;
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
    }

    // Getters y Setters
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

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Cojineria getCojineria() {
        return cojineria;
    }

    public void setCojineria(Cojineria cojineria) {
        this.cojineria = cojineria;
    }
}
