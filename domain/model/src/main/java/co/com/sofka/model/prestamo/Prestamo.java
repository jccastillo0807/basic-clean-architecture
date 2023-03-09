package co.com.sofka.model.prestamo;
import co.com.sofka.model.libro.Libro;
import co.com.sofka.model.usuario.Usuario;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder(toBuilder = true)
public class Prestamo {
    private Long id;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Usuario usuario;
    private Libro libro;
}
