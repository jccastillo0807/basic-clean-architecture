package co.com.sofka.jpa;

import co.com.sofka.jpa.autor.AutorData;
import co.com.sofka.model.autor.Autor;

public class DataMapper {

    private DataMapper() {
    }

    public static Autor toEntity(AutorData data) {
        return Autor.builder()
                .codigo(data.getCodigo())
                .nombre(data.getNombre())
                .build();
    }
}
