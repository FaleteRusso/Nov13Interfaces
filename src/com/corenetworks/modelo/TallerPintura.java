package com.corenetworks.modelo;

public class TallerPintura implements ITaller{

    @Override
    public String reparar(Coche c) {
        return "El coche está en chapa y pintura" + c.getMatricula() +"Modelo: "+ c.getModelo();
    }
}
