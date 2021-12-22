package co.com.sofka.demo_ddd.venta.values;
import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public final class Cedula implements ValueObject<Cedula.Properties> {
    private final int valor;

    public Cedula(int valor) {
        this.valor = valor;
        if (this.valor < 0) {
            throw new IllegalArgumentException("La cédula no puede ser un valor negativo");
        }
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public int valor() {
                return valor;
            }
        };
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cedula cedula = (Cedula) o;
        return Objects.equals(valor, cedula.valor);
    }

    public interface  Properties {
        int valor();
    }
}