package co.com.sofka.jpa.usuario;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "T_USUARIOS")
@NoArgsConstructor
public class UsuarioData {
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

}
