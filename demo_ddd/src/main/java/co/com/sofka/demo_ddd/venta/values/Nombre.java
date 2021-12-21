package co.com.sofka.demo_ddd.venta.values;

import java.io.Serializable;

public class Nombre implements Serializable {
    private final String primerNombre;
    private final String primerApellido;

    public Nombre(String primerNombre, String primerApellido) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
    }

    public String value(){
        return null;
    }
}
