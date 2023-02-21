package co.com.sofka.usecase.producto;

import co.com.sofka.model.producto.gateways.ProductoRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class ProductoUseCase {
private final ProductoRepository productoRepository;
}
