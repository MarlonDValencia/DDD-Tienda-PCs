package co.com.sofka.demo_ddd.catalogo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Categoria implements ValueObject<String> {
    private final String nombreCategoria;

    public Categoria(String nombreCategoria){
        this.nombreCategoria = Objects.requireNonNull(nombreCategoria);
    }

    @Override
    public String value() {
        return nombreCategoria;
    }
}