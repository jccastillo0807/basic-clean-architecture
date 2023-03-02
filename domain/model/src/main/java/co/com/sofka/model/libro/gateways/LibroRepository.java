package co.com.sofka.model.libro.gateways;

import co.com.sofka.model.libro.Libro;

import java.util.List;

public interface LibroRepository {
    public List<Libro> findAll();

    public Libro findById(Long id);

    public Libro create(Libro libro);

    public void delete(Long id);
}
