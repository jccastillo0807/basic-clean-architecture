package co.com.sofka.usecase.autor;

import co.com.sofka.model.autor.Autor;
import co.com.sofka.model.autor.gateways.AutorRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class AutorUseCase {
    private final AutorRepository autorRepository;

    public Flux<Autor> encontrarAutores(){
        return autorRepository.findAll();
    }
}
