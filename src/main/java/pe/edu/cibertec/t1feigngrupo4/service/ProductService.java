package pe.edu.cibertec.t1feigngrupo4.service;

import pe.edu.cibertec.t1feigngrupo4.client.ProductClient;
import pe.edu.cibertec.t1feigngrupo4.model.ProductStoreDto;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductClient productClient;

    public ProductService(ProductClient productClient) {
        this.productClient = productClient;
    }

    public List<ProductStoreDto> obtenerProductos() {
        return productClient.getProducts()
                .stream()
                .filter(product -> product.getPrice() > 50.0)
                .filter(product -> product.getCategory().equals("electronics"))
                .toList();
    }
}