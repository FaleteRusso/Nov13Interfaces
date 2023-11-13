package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarAseguradora {
    public static void main(String[] args) {
        Coche c1=new Coche(" 1234FHJ "," Seat Leon ");
        ITaller tMecanico= new TallerMecanico();
        SeguroCoche s1=new SeguroCoche(tMecanico,"Mutua Madrileña");
        System.out.println(s1.reparar(c1));
        ITaller tpintura= new TallerPintura();
        s1.setTaller(tpintura);
        System.out.println(s1.reparar(c1));
    }
}
