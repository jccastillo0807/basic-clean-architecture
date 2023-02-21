package co.com.sofka.api.categoria;

import co.com.sofka.api.categoria.dto.CategoriaDTO;
import co.com.sofka.usecase.categoria.CategoriaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/categoria")
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaUseCase categoriaUseCase;


   @GetMapping(path = "/lista", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<CategoriaDTO> listarCategorias() {
        return categoriaUseCase.encontrarTodas()
                .map(categoria -> CategoriaConverter.construirRespuesta(categoria));
    }
}
