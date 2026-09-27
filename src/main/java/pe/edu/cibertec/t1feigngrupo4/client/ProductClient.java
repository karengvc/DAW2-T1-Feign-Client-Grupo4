package pe.edu.cibertec.t1feigngrupo4.client;
import pe.edu.cibertec.t1feigngrupo4.model.ProductStoreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(
        name = "productClient",
        url = "https://fakestoreapi.com"
)
public interface ProductClient {

    @GetMapping("/products")
    List<ProductStoreDto> getProducts();
}