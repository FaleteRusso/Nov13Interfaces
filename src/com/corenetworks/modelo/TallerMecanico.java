package com.corenetworks.modelo;

public class TallerMecanico implements ITaller {

    @Override
    public String reparar(Coche c) {
        return "El coche se está en el taller mécanico" + c.getMatricula()+"Modelo: "+ c.getModelo();
    }
}
