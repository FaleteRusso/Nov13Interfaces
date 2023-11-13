package com.corenetworks.modelo;

public class ClienteIdao {
    private IDAO conexion;
    public String insertar (Cliente c1){
return conexion.insertar(c1);
    }

    @Override
    public String toString() {
        return "ClienteIdao{" +
                "conexion=" + conexion +
                '}';
    }

    public ClienteIdao() {
    }

    public ClienteIdao(IDAO conexion) {
        this.conexion = conexion;
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
