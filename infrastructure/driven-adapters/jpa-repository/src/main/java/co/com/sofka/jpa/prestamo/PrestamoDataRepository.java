package co.com.sofka.jpa.prestamo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface PrestamoDataRepository extends CrudRepository<PrestamoData, Long>, QueryByExampleExecutor<PrestamoData> {
}
