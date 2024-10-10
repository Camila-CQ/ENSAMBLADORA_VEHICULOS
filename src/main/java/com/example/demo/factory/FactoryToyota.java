package com.example.demo.factory;

import com.example.demo.components.Chasis;
import com.example.demo.components.Cojineria;
import com.example.demo.components.Motor;
import com.example.demo.toyota.ToyotaChasis;
import com.example.demo.toyota.ToyotaCojineria;
import com.example.demo.toyota.ToyotaMotor;

public class FactoryToyota implements AbstractFactory {

    @Override
    public Chasis createChasis(int nroEjes, int nroPieza, String tipoTransmision) {
        return new ToyotaChasis(nroEjes, nroPieza, tipoTransmision);
    }

    @Override
    public Motor createMotor(int potenciaMaxima, int nroPieza, String tecnologia) {
        return new ToyotaMotor(potenciaMaxima, nroPieza, tecnologia);
    }

    @Override
    public Cojineria createCojineria(int nroPieza, String materialBase) {
        return new ToyotaCojineria(nroPieza, materialBase);
    }
}
