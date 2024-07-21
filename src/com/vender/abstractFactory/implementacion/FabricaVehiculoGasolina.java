package com.vender.abstractFactory.implementacion;

import com.vender.abstractFactory.abstractClass.Automovil;
import com.vender.abstractFactory.abstractClass.Scooter;
import com.vender.abstractFactory.interfaz.FabricaVehiculo;

public class FabricaVehiculoGasolina implements FabricaVehiculo {
    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilGasolina(modelo,color,potencia,espacio);
    }

    @Override
    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterGasolina(modelo,color,potencia);
    }
}
