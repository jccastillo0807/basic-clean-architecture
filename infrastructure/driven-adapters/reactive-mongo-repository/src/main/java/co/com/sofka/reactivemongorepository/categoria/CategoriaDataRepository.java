package co.com.sofka.reactivemongorepository.categoria;

import co.com.sofka.model.categoria.Categoria;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoriaDataRepository extends ReactiveMongoRepository<Categoria, String> {
}
