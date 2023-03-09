package co.com.sofka.jpa.prestamo;

import co.com.sofka.jpa.libro.LibroData;
import co.com.sofka.jpa.usuario.UsuarioData;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "T_PRESTAMOS")
@NoArgsConstructor
public class PrestamoData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "fecha_prestamo", nullable = false)
    private Date fechaPrestamo;

    @NotEmpty
    @Column(name = "fecha_devolucion", nullable = false)
    private Date fechaDevolucion;

    @ManyToOne(fetch = FetchType.LAZY)
    private UsuarioData usuarioData;

    @ManyToOne(fetch = FetchType.LAZY)
    private LibroData libroData;

    private static final long serialVersionUID = 1L;
}
