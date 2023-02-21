package co.com.sofka.reactivemongorepository.producto;

import co.com.sofka.model.producto.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoDataRepository extends ReactiveMongoRepository<Producto, String> {
}
