package co.com.sofka.model.usuario.gateways;

import co.com.sofka.model.usuario.Usuario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsuarioRepository {
    Flux<Usuario> findAll();

    Mono<Usuario> findByCodigo(Long id);

    Mono<Usuario> create(Usuario usuario);

    void delete(Long id);
}
