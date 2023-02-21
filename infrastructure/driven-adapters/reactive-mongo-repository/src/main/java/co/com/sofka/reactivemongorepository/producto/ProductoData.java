package co.com.sofka.reactivemongorepository.producto;

import co.com.sofka.reactivemongorepository.categoria.CategoriaData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "productos")
public class ProductoData {
    @Id
    private String id;

    @NotEmpty
    private String nombre;

    @NotNull
    private Double precio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;

    @Valid
    private CategoriaData categoria;

    private String foto;

    public ProductoData(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public ProductoData(String nombre, Double precio, CategoriaData categoria) {
        this(nombre, precio);
        this.categoria = categoria;
    }
}
