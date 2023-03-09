package co.com.sofka.model.producto.gateways;

import co.com.sofka.model.producto.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoRepository {
    Flux<Producto> findAll();
    Mono<Producto> findById(String id);
    Mono<Producto> save(Producto producto);
    Mono<Void> delete(Producto producto);
}
