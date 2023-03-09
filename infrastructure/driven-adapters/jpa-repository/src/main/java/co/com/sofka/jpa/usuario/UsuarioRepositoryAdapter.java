package co.com.sofka.jpa.usuario;

import co.com.sofka.jparepositorycommons.AdapterOperations;
import co.com.sofka.model.usuario.Usuario;
import co.com.sofka.model.usuario.gateways.UsuarioRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
public class UsuarioRepositoryAdapter extends AdapterOperations<Usuario, UsuarioData, Long, UsuarioDataRepository>
        implements UsuarioRepository {

    public UsuarioRepositoryAdapter(UsuarioDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Usuario.UsuarioBuilder.class).build());
    }

    @Override
    public Flux<Usuario> findAll() {
        return doQueryMany(repository::findAll);
    }

    @Override
    public Mono<Usuario> findByCodigo(Long id) {
        Optional<UsuarioData> usuarioData = repository.findById(id);
        return Mono.just(
                Usuario.builder()
                        .id(usuarioData.get().getId())
                        .tipoIdentificacion(usuarioData.get().getTipoIdentificacion())
                        .numeroIdentificacion(usuarioData.get().getNumeroIdentificacion())
                        .direccion(usuarioData.get().getDireccion())
                        .telefono(usuarioData.get().getTelefono())
                        .nombre(usuarioData.get().getNombre())
                        .build()
        );
    }

    @Override
    public Mono<Usuario> create(Usuario usuario) {
        return save(usuario);
    }

    @Override
    public void delete(Long id) {
        delete(id);
    }
}
