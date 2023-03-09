package co.com.sofka.model.categoria.gateways;

import co.com.sofka.model.categoria.Categoria;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CategoriaRepository {
    Flux<Categoria> findAllCategoria();


    Mono<Categoria> findCategoriaById(String id);


    Mono<Categoria> saveCategoria(Categoria categoria);
}
