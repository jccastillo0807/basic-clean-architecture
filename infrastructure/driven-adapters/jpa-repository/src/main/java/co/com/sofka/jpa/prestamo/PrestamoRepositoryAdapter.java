package co.com.sofka.jpa.prestamo;

import co.com.sofka.jparepositorycommons.AdapterOperations;
import co.com.sofka.model.prestamo.Prestamo;
import co.com.sofka.model.prestamo.gateways.PrestamoRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
public class PrestamoRepositoryAdapter extends AdapterOperations<Prestamo, PrestamoData, Long, PrestamoDataRepository>
        implements PrestamoRepository {

    @Autowired
    public PrestamoRepositoryAdapter(PrestamoDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Prestamo.PrestamoBuilder.class).build());
    }

    @Override
    public Flux<Prestamo> findAll() {
        return doQueryMany(repository::findAll);
    }

    @Override
    public Prestamo findByCodigo(Long id) {
        Optional<PrestamoData> prestamoData = repository.findById(id);
        return Prestamo.builder()
                .id(prestamoData.get().getId())
                .fechaPrestamo(prestamoData.get().getFechaPrestamo())
                .fechaDevolucion(prestamoData.get().getFechaDevolucion())
                .build();
    }

    @Override
    public Mono<Prestamo> create(Prestamo prestamo) {
        return save(prestamo);
    }

    @Override
    public void delete(Long id) {
        delete(id);
    }
}
