package co.com.sofka.jpa.libro;

import co.com.sofka.jpa.escritura.EscrituraData;
import co.com.sofka.jpa.prestamo.PrestamoData;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "T_LIBROS")
//@NoArgsConstructor
public class LibroData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotEmpty
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @NotEmpty
    @Column(name = "isbn", nullable = false)
    private String isbn;

    @NotEmpty
    @Column(name = "editorial", nullable = false)
    private String editorial;

    @NotEmpty
    @Column(name = "nro_paginas", nullable = false)
    private Integer nroPaginas;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "libroData")
    private List<PrestamoData> prestamoData;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "libroData")
    private List<EscrituraData> escrituraData;

    public LibroData(){
        this.escrituraData = new ArrayList<>();
        this.prestamoData = new ArrayList<>();
    }

    private static final long serialVersionUID = 1L;
}
