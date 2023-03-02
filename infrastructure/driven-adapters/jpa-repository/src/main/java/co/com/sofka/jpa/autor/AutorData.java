package co.com.sofka.jpa.autor;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "T_AUTORES")
@NoArgsConstructor
public class AutorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotEmpty
    @Column(name = "nombre")
    private String nombre;
}
