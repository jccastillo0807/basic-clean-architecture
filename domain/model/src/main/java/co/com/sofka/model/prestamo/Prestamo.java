package co.com.sofka.model.prestamo;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder(toBuilder = true)
public class Prestamo {
    private Long id;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
}
