package co.com.sofka.api.autor;

import co.com.sofka.api.autor.dto.AutorDTO;
import co.com.sofka.usecase.autor.AutorUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/autor")
@RequiredArgsConstructor
public class AutorService {

    private final AutorUseCase autorUseCase;

    @GetMapping(path = "/lista", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<AutorDTO> listarCategorias() {
        return autorUseCase.encontrarAutores()
                .map(autor -> AutorConverter.construirRespuesta(autor));
    }
}
