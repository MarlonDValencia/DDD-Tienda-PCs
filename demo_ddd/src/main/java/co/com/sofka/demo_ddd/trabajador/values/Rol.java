package co.com.sofka.demo_ddd.trabajador.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Rol implements ValueObject<String> {
    private final String nombreRol;

    public Rol(String nombreRol){
        this.nombreRol = Objects.requireNonNull(nombreRol);
    }

    @Override
    public String value() {
        return nombreRol;
    }
}
