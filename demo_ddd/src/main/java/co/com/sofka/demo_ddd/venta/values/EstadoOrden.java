package co.com.sofka.demo_ddd.venta.values;

import java.util.Objects;

public class EstadoOrden {
    public String state;

    public EstadoOrden(String state) {
        this.state = "Open";
    }

    public void setState(String state) {
        this.state = Objects.requireNonNull(state);
    }

}
