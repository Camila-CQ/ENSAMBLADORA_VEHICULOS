package com.example.demo.factory;

import com.example.demo.components.Chasis;
import com.example.demo.components.Cojineria;
import com.example.demo.components.Motor;
import com.example.demo.mazda.MazdaChasis;
import com.example.demo.mazda.MazdaCojineria;
import com.example.demo.mazda.MazdaMotor;

public class FactoryMazda implements AbstractFactory {

    @Override
    public Chasis createChasis(int nroEjes, int nroPieza, String tipoTransmision) {
        return new MazdaChasis(nroEjes, nroPieza, tipoTransmision); 
    }

    @Override
    public Motor createMotor(int potenciaMaxima, int nroPieza, String tecnologia) {
        return new MazdaMotor(potenciaMaxima, nroPieza, tecnologia);   
    }

    @Override
    public Cojineria createCojineria(int nroPieza, String materialBase) {
        return new MazdaCojineria(nroPieza, materialBase);  
    }
}
