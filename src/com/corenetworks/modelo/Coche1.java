package com.corenetworks.modelo;

public class Coche1 implements IVehiculo {
    private int deposito;
    @Override
    public String moverse() {
        if (deposito > 0) {
            return "El coche tiene combustible para moverse";
        } else {
           return "El coche no puede arrancar por falta de combustible";
        }

    }



    public Coche1() {
    }

    public Coche1(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String toString() {
        return "Coche1{" +
                "deposito=" + deposito +
                '}';
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }


}
