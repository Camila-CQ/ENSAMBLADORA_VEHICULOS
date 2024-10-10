package com.example.demo.controllers;

import com.example.demo.components.*;
import com.example.demo.factory.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @PostMapping("/crear")
    public ResponseEntity<Vehiculo> crearVehiculo(@RequestBody VehiculoRequest request) {
        // Seleccionar la factoría adecuada
        AbstractFactory factory = getFactoryByBrand(request.getMarca());

        if (factory == null) {
            return ResponseEntity.badRequest().build(); // Marca no soportada
        }

        // Crear componentes utilizando la factoría seleccionada
        Chasis chasis = factory.createChasis(request.getNroEjes(), request.getNroPiezaChasis(), request.getTipoTransmision());
        Motor motor = factory.createMotor(request.getPotenciaMax(), request.getNroPiezaMotor(), request.getTecnologiaMotor());
        Cojineria cojineria = factory.createCojineria(request.getNroPiezaCojineria(), request.getMaterialCojineria());

        // Crear y devolver el vehículo ensamblado
        Vehiculo vehiculo = new Vehiculo(request.getMarca(), request.getColor(), chasis, motor, cojineria);
        return ResponseEntity.ok(vehiculo);
    }

    private AbstractFactory getFactoryByBrand(String marca) {
        switch (marca.toLowerCase()) {
            case "ford":
                return new FactoryFord();
            case "mazda":
                return new FactoryMazda();
            case "toyota":
                return new FactoryToyota();
            default:
                return null; // Marca no soportada
        }
    }
}
