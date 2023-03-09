package co.com.sofka.jpa.escritura;

import co.com.sofka.jpa.autor.AutorData;
import co.com.sofka.jpa.libro.LibroData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "T_AUTORES_LIBROS")
public class EscrituraData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private AutorData autorData;

    @ManyToOne(fetch = FetchType.LAZY)
    private LibroData libroData;

    private static final long serialVersionUID = 1L;
}
