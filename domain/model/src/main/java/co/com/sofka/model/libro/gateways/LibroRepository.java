package co.com.sofka.model.libro.gateways;

import co.com.sofka.model.libro.Libro;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LibroRepository {
    Flux<Libro> findAll();

    Libro findByCodigo(Long id);

    Mono<Libro> create(Libro libro);

    void delete(Long id);
}
