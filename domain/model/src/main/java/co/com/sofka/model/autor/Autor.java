package co.com.sofka.model.autor;
import co.com.sofka.model.escritura.Escritura;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode
public class Autor {
    final Long codigo;
    final String nombre;
    final List<Escritura> escrituras;
}
