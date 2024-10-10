package com.example.demo.factory;

import com.example.demo.components.Chasis;
import com.example.demo.components.Cojineria;
import com.example.demo.components.Motor;

public interface AbstractFactory {
    Chasis createChasis(int nroEjes, int nroPieza, String tipoTransmision);
    Motor createMotor(int potenciaMaxima, int nroPieza, String tecnologia);
    Cojineria createCojineria(int nroPieza, String materialBase);
}
