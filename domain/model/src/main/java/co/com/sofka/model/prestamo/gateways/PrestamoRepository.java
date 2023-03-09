package co.com.sofka.model.prestamo.gateways;

import co.com.sofka.model.prestamo.Prestamo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PrestamoRepository {
    Flux<Prestamo> findAll();

    Prestamo findByCodigo(Long id);

    Mono<Prestamo> create(Prestamo prestamo);

    void delete(Long id);
}
