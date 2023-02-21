package co.com.sofka.model.categoria;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Categoria {
    private String id;
    private String nombre;

}
