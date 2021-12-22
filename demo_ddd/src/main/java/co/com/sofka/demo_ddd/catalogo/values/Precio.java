package co.com.sofka.demo_ddd.catalogo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Precio implements ValueObject<Precio.Properties> {
    private final Double valor;

    public Precio(Double valor) {
        this.valor = Objects.requireNonNull(valor, "El precio es requerido");
        if (this.valor < 0) {
            throw new IllegalArgumentException("El valor no puede ser cero o negativo");
        }
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public Double valor() {
                return valor;
            }
        };
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Precio precio = (Precio) o;
        return Objects.equals(valor, precio.valor);
    }

    public interface  Properties {
        Double valor();
    }
}