package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class EstadoOrden implements ValueObject<EstadoOrden.Properties> {
    public String state;

    public EstadoOrden(Double valor) {
        this.state = Objects.requireNonNull(state, "El estado de la orden no puede ser null");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String state() {
                return state;
            }
        };
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoOrden estadoOrden = (EstadoOrden) o;
        return Objects.equals(state, estadoOrden.state);
    }

    public interface  Properties {
        String state();
    }
}