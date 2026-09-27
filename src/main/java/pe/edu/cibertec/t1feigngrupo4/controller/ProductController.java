package pe.edu.cibertec.t1feigngrupo4.controller;

import pe.edu.cibertec.t1feigngrupo4.model.ProductStoreDto;
import pe.edu.cibertec.t1feigngrupo4.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductStoreDto> obtenerProductos() {
        return productService.obtenerProductos();
    }
}