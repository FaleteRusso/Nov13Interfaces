package com.corenetworks.presentacion;

import com.corenetworks.modelo.Coche1;
import com.corenetworks.modelo.Conductor;

public class ProbarConductor {
    public static void main(String[] args) {
        Coche1 c1=new Coche1(18);
        Conductor d1=new Conductor(c1);
        System.out.println(d1.conducir());
    }
}
