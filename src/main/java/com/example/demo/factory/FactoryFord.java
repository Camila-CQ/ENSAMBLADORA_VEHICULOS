package com.example.demo.factory;

import com.example.demo.components.Chasis;
import com.example.demo.components.Cojineria;
import com.example.demo.components.Motor;
import com.example.demo.ford.FordChasis;
import com.example.demo.ford.FordCojineria;
import com.example.demo.ford.FordMotor;

public class FactoryFord implements AbstractFactory {

    @Override
    public Chasis createChasis(int nroEjes, int nroPieza, String tipoTransmision) {
        return new FordChasis(nroEjes, nroPieza, tipoTransmision);
    }

    @Override
    public Motor createMotor(int potenciaMaxima, int nroPieza, String tecnologia) {
        return new FordMotor(potenciaMaxima, nroPieza, tecnologia);
    }

    @Override
    public Cojineria createCojineria(int nroPieza, String materialBase) {
        return new FordCojineria(nroPieza, materialBase);
    }
}
