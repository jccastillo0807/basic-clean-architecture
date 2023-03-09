package co.com.sofka.jpa.autor;

import co.com.sofka.jpa.DataMapper;
import co.com.sofka.jparepositorycommons.AdapterOperations;
import co.com.sofka.model.autor.Autor;
import co.com.sofka.model.autor.gateways.AutorRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;


@Repository
public class AutorRepositoryAdapter extends AdapterOperations<Autor, AutorData, Long, AutorDataRepository>
        implements AutorRepository {

    @Autowired
    public AutorRepositoryAdapter(AutorDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Autor.AutorBuilder.class).build());
    }

    @Override
    protected Autor toEntity(AutorData data) {
        return DataMapper.toEntity(data);
    }

    @Override
    public Flux<Autor> findAll() {
        return doQueryMany(repository::findAll);
    }

    @Override
    public Mono<Autor> findByCodigo(Long codigo) {
        Optional<AutorData> autorData = repository.findById(codigo);
        return Mono.just(
                Autor.builder()
                        .codigo(autorData.get().getCodigo())
                        .nombre(autorData.get().getNombre())
                        .build()
        );
    }

    @Override
    public Mono<Autor> findByNombre(String nombre) {
        AutorData autorData = repository.findByNombre(nombre);
        return Mono.just(
                Autor.builder()
                        .nombre(autorData.getNombre())
                        .codigo(autorData.getCodigo())
                        .build()
        );
    }
}
