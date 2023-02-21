package co.com.sofka.usecase.categoria;

import co.com.sofka.model.categoria.Categoria;
import co.com.sofka.model.categoria.gateways.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CategoriaUseCase {
    private final CategoriaRepository categoriaRepository;

    public Flux<Categoria> encontrarTodas() {
        return categoriaRepository.findAllCategoria();
    }

    public Mono<Categoria> encontrarPorId(String id){
        return categoriaRepository.findCategoriaById(id);
    }

    public Mono<Categoria> guardarCategoria(Categoria categoria){
        return categoriaRepository.saveCategoria(categoria);
    }
}
