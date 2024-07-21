package com.vender.abstractFactory.interfaz;

import com.vender.abstractFactory.abstractClass.Automovil;
import com.vender.abstractFactory.abstractClass.Scooter;

public interface FabricaVehiculo {
    Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);
    Scooter creaScooter(String modelo, String color, int potencia);

}
