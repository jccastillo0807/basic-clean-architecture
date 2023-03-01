package co.com.sofka.reactivemongorepository.categoria;

import co.com.sofka.model.categoria.Categoria;
import co.com.sofka.model.categoria.gateways.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class CategoriaRepositoryAdapter implements CategoriaRepository {
    @Autowired
    private CategoriaDataRepository categoriaDataRepository;

    @Override
    public Flux<Categoria> findAllCategoria() {
        Flux<Categoria> categorias =  categoriaDataRepository.findAll();
        return categorias;

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
