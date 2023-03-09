package co.com.sofka.jpa.libro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface LibroDataRepository extends CrudRepository<LibroData, Long>, QueryByExampleExecutor<LibroData> {
LibroData findByCodigo(Long id);
}
