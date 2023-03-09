package co.com.sofka.jpa.autor;

import co.com.sofka.jpa.escritura.EscrituraData;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "autorData")
    private List<EscrituraData> escrituraData;
}
