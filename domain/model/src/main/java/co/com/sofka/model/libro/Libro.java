package co.com.sofka.model.libro;
import co.com.sofka.model.escritura.Escritura;
import co.com.sofka.model.prestamo.Prestamo;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class Libro {
    private Long codigo;
    private String nombre;
    private String isbn;
    private String editorial;
    private Integer nroPaginas;
    private List<Prestamo> prestamos;
    private List<Escritura> escrituras;
}
