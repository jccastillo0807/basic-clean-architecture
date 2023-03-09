package co.com.sofka.model.escritura;
import co.com.sofka.model.autor.Autor;
import co.com.sofka.model.libro.Libro;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Escritura {
    private Long id;
    private Libro libro;
    private Autor autor;
}
