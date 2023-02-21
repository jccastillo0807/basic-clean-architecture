package co.com.sofka.reactivemongorepository.categoria;

import co.com.sofka.model.categoria.Categoria;
import co.com.sofka.model.categoria.gateways.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class CategoriaRepositoryAdapter implements CategoriaRepository {
    private final CategoriaDataRepository categoriaDataRepository;

    @Override
    public Flux<Categoria> findAllCategoria() {
        return categoriaDataRepository.findAll();
    }

    @Override
    public Mono<Categoria> findCategoriaById(String id) {
        return categoriaDataRepository.findById(id);
    }

    @Override
    public Mono<Categoria> saveCategoria(Categoria categoria) {
        return categoriaDataRepository.save(categoria);
    }
}
