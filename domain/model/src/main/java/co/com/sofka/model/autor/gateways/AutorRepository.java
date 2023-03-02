package co.com.sofka.model.autor.gateways;

import co.com.sofka.model.autor.Autor;
import reactor.core.publisher.Flux;

public interface AutorRepository {
Flux <Autor> findAll();
Autor findByCodigo(Long id);
Autor findByNombre(String nombre);
}
