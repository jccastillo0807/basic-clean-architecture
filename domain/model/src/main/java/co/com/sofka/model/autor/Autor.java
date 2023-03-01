package co.com.sofka.model.autor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Autor {
    private Long codigo;
    private String nombre;
}
