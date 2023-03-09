package co.com.sofka.jpa.libro;

import co.com.sofka.jparepositorycommons.AdapterOperations;
import co.com.sofka.model.libro.Libro;
import co.com.sofka.model.libro.gateways.LibroRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
public class LibroRepositoryAdapter extends AdapterOperations<Libro, LibroData, Long, LibroDataRepository>
        implements LibroRepository {

    @Autowired
    public LibroRepositoryAdapter(LibroDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Libro.LibroBuilder.class).build());
    }

    @Override
    public Flux<Libro> findAll() {
        return doQueryMany(repository::findAll);
    }

    @Override
    public Libro findByCodigo(Long id) {
        Optional<LibroData> libroData = repository.findById(id);
        return Libro.builder()
                .codigo(libroData.get().getCodigo())
                .nombre(libroData.get().getNombre())
                .isbn(libroData.get().getIsbn())
                .editorial(libroData.get().getEditorial())
                .nroPaginas(libroData.get().getNroPaginas())
                .build();
    }

    @Override
    public Mono<Libro> create(Libro libro) {
        return save(libro);
    }

    @Override
    public void delete(Long id) {
        delete(id);
    }
}
