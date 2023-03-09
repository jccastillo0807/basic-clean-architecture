package co.com.sofka.jpa.usuario;

import co.com.sofka.jpa.prestamo.PrestamoData;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "T_USUARIOS")
//@NoArgsConstructor
public class UsuarioData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;

    @NotEmpty
    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    private String direccion;

    private String telefono;

    @NotEmpty
    private String nombre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarioData")
    private List<PrestamoData> prestamoData;

    public UsuarioData() {
        this.prestamoData = new ArrayList<>();
    }

    private static final long serialVersionUID = 1L;
}
