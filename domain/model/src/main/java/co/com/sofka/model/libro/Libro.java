package co.com.sofka.model.libro;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Libro {
    private Long codigo;
    private String nombre;
}
