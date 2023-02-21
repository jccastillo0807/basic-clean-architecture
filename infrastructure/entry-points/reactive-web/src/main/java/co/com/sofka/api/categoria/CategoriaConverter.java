package co.com.sofka.api.categoria;

import co.com.sofka.api.categoria.dto.CategoriaDTO;
import co.com.sofka.model.categoria.Categoria;

public class CategoriaConverter {
    public CategoriaConverter() {
    }

    public static CategoriaDTO construirRespuesta(Categoria categoria) {
        CategoriaDTO categoriaDTO = new CategoriaDTO();
        categoriaDTO.setId(categoriaDTO.getId());
        categoriaDTO.setNombre(categoriaDTO.getNombre());

        return categoriaDTO;
    }
}
