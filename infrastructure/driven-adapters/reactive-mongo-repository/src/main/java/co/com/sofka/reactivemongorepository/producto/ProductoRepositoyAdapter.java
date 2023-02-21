package co.com.sofka.reactivemongorepository.producto;

import co.com.sofka.model.producto.Producto;
import co.com.sofka.model.producto.gateways.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class ProductoRepositoyAdapter implements ProductoRepository {

    private final ProductoDataRepository productoDataRepository;

    @Override
    public Flux<Producto> findAll() {
        return productoDataRepository.findAll();
    }

    @Override
    public Mono<Producto> findById(String id) {
        return productoDataRepository.findById(id);
    }

    @Override
    public Mono<Producto> save(Producto producto) {
        return productoDataRepository.save(producto);
    }

    @Override
    public Mono<Void> delete(Producto producto) {
        return productoDataRepository.delete(producto);
    }
}
