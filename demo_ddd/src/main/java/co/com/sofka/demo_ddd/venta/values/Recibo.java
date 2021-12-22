package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Recibo implements ValueObject<Recibo.Properties> {
    private final Double valor;

    public Recibo(Double valor) {
        this.valor = Objects.requireNonNull(valor, "El valor total es requerido");
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
        Recibo recibo = (Recibo) o;
        return Objects.equals(valor, recibo.valor);
    }

    public interface  Properties {
        Double valor();
    }
}
