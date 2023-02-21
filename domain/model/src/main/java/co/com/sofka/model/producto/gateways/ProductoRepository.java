package co.com.sofka.model.producto.gateways;

import co.com.sofka.model.producto.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoRepository {
    public Flux<Producto> findAll();
    public Mono<Producto> findById(String id);
    public Mono<Producto> save(Producto producto);
    public Mono<Void> delete(Producto producto);
}
