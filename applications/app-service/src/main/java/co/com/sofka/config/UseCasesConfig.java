package co.com.sofka.config;

import co.com.sofka.model.autor.gateways.AutorRepository;
import co.com.sofka.model.categoria.gateways.CategoriaRepository;
import co.com.sofka.usecase.autor.AutorUseCase;
import co.com.sofka.usecase.categoria.CategoriaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.sofka.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {

    @Bean
    public CategoriaUseCase getCategoriaUseCase(CategoriaRepository categoriaRepository) {
        return new CategoriaUseCase(categoriaRepository);
    }

    @Bean
    public AutorUseCase getAutorUseCase(AutorRepository autorRepository) {
        return new AutorUseCase(autorRepository);
    }
}
