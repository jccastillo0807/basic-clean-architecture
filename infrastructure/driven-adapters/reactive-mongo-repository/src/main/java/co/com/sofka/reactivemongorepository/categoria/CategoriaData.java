package co.com.sofka.reactivemongorepository.categoria;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Document(collection = "categorias")
public class CategoriaData {
    @Id
    @NotEmpty
    private String id;

    private String nombre;

    public CategoriaData(String nombre) {
        this.nombre = nombre;
    }
}
