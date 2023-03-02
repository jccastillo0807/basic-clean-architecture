package co.com.sofka.model.prestamo.gateways;

import co.com.sofka.model.prestamo.Prestamo;

import java.util.List;

public interface PrestamoRepository {
    public List<Prestamo> findAll();

    public Prestamo findById(Long id);

    public Prestamo create(Prestamo prestamo);

    public void delete(Long id);
}
