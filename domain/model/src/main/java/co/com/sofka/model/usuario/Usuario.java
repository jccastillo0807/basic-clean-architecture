package co.com.sofka.model.usuario;
import co.com.sofka.model.prestamo.Prestamo;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class Usuario {
    private Long id;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String direccion;
    private String telefono;
    private String nombre;
    private List<Prestamo> prestamos;
}
