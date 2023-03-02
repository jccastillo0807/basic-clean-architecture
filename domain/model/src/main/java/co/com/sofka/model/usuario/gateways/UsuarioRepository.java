package co.com.sofka.model.usuario.gateways;

import co.com.sofka.model.usuario.Usuario;

import java.util.List;

public interface UsuarioRepository {
    public List<Usuario> findAll();

    public Usuario findById(Long id);

    public Usuario create(Usuario usuario);

    public void delete(Long id);
}
