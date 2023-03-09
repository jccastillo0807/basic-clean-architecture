package co.com.sofka.api.autor.dto;

import co.com.sofka.model.escritura.Escritura;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AutorDTO {
    private Long codigo;
    private String nombre;
    private List<Escritura> escrituras;
}
