package co.com.sofka.model.categoria.gateways;

import co.com.sofka.model.categoria.Categoria;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CategoriaRepository {
    public Flux<Categoria> findAllCategoria();


    public Mono<Categoria> findCategoriaById(String id);


    public Mono<Categoria> saveCategoria(Categoria categoria);
}
