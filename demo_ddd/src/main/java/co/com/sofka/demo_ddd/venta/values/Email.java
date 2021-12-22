package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public final class Email implements ValueObject<Email.Properties> {
    private final String correo;

    public Email(String correo) {
        this.correo = Objects.requireNonNull(correo, "El correo es requerido");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String correo() {
                return correo;
            }
        };
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(correo, email.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correo);
    }

    public interface  Properties {
        String correo();
    }
}
