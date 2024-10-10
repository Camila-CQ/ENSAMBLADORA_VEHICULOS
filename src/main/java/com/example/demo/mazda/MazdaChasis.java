package com.example.demo.mazda;

import com.example.demo.components.Chasis;

public class MazdaChasis extends Chasis {
    public MazdaChasis(int nroEjes, int nroPieza, String tipoTransmision) {
        super(nroEjes, nroPieza, tipoTransmision); // Llama al constructor de la clase Chasis
    }

    @Override
    public int getNroEjes() {
        return super.getNroEjesValue();
    }

    @Override
    public int getNroPieza() {
        return super.getNroPiezaValue();
    }

    @Override
    public String getTipoTransmision() {
        return super.getTipoTransmisionValue();
    }
}
