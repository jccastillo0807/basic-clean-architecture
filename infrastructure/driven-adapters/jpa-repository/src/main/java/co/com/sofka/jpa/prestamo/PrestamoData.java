package co.com.sofka.jpa.prestamo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Entity
@Table(name = "T_PRESTAMOS")
@NoArgsConstructor
public class PrestamoData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "fecha_prestamo", nullable = false)
    private Date fechaPrestamo;

    @NotEmpty
    @Column(name = "fecha_devolucion", nullable = false)
    private Date fechaDevolucion;
}
