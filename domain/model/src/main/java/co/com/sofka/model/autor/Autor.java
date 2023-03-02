package co.com.sofka.model.autor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode
public class Autor {
    final Long codigo;
    final String nombre;
}
