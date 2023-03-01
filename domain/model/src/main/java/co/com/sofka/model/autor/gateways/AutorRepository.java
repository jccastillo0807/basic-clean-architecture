package co.com.sofka.model.autor.gateways;

import co.com.sofka.model.autor.Autor;

import java.util.List;

public interface AutorRepository {
    public List<Autor> findAll();

    public Autor findById(Long id);

    public Autor create(Autor autor);

    public void delete(Long id);
}
