package co.com.sofka.model.usuario;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Usuario {
    private Long id;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String direccion;
    private String telefono;
    private String nombre;
}
