package com.corenetworks.presentacion;

import com.corenetworks.modelo.AccesoDesarrollo;
import com.corenetworks.modelo.AccesoProduccion;
import com.corenetworks.modelo.Cliente;
import com.corenetworks.modelo.ClienteIdao;

public class PruebaIdao {
    public static void main(String[] args) {
        Cliente c1= new Cliente("José Guillem"," 45678934B");
        AccesoDesarrollo ad1= new AccesoDesarrollo();
        AccesoProduccion ap1= new AccesoProduccion();
        ClienteIdao ci1= new ClienteIdao();
        System.out.println(ad1.insertar(c1));


    }
}
