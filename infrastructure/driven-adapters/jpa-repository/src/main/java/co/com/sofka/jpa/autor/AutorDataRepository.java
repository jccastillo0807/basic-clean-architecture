package co.com.sofka.jpa.autor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface AutorDataRepository extends CrudRepository<AutorData, Long>, QueryByExampleExecutor<AutorData> {
    AutorData findByCodigo(Long codigo);
    AutorData findByNombre(String nombre);
}
