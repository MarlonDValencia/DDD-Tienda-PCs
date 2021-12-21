package co.com.sofka.demo_ddd.trabajador.values;

import java.io.Serializable;

public class Rol implements Serializable {
    private final String nombreRol;

    public Rol(String nombreRol){
        this.nombreRol = nombreRol;
    }

    public String getNombreRol(){
        return nombreRol;
    }
}
