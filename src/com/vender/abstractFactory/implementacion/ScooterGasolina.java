package com.vender.abstractFactory.implementacion;

import com.vender.abstractFactory.abstractClass.Scooter;

public class ScooterGasolina extends Scooter {
    public ScooterGasolina(String modelo, String color, int potencia){
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "Scooter de gasolina de modelo: " + modelo +
                " de color: " + color + " de potencia: " +
                potencia);
    }
}
