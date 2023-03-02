package co.com.sofka.jpa.libro;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "T_LIBROS")
@NoArgsConstructor
public class LibroData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotEmpty
    @Column(name = "nombre", nullable = false)
    private String nombre;
}
