package co.com.sofka.jpa.usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UsuarioDataRepository extends CrudRepository<UsuarioData, Long>, QueryByExampleExecutor<UsuarioData> {
}
