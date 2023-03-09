package co.com.sofka.api.autor;

import co.com.sofka.api.autor.dto.AutorDTO;
import co.com.sofka.model.autor.Autor;

public class AutorConverter {
    public AutorConverter() {
    }

    public static AutorDTO construirRespuesta(Autor autor) {
        AutorDTO autorDTO = new AutorDTO();
        autorDTO.setCodigo(autor.getCodigo());
        autorDTO.setNombre(autor.getNombre());
        autorDTO.setEscrituras(autor.getEscrituras());

        return autorDTO;
    }
}
