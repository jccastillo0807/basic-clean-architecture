package co.com.sofka.model.autor.gateways;

import co.com.sofka.model.autor.Autor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AutorRepository {
Flux <Autor> findAll();
Mono<Autor> findByCodigo(Long id);
Mono<Autor> findByNombre(String nombre);
}
