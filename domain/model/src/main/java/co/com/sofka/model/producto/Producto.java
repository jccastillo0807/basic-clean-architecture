package co.com.sofka.model.producto;
import co.com.sofka.model.categoria.Categoria;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder(toBuilder = true)
public class Producto {
    private String id;
    private String nombre;
    private Double precio;
    private Date createAt;
    private Categoria categoria;
    private String foto;
}
