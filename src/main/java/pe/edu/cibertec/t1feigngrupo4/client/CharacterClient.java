package pe.edu.cibertec.t1feigngrupo4.client;

import pe.edu.cibertec.t1feigngrupo4.model.CharacterRM;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "characterClient",
        url = "https://rickandmortyapi.com/api"
)
public interface CharacterClient {

    @GetMapping("/character")
    CharacterRM.ApiResponse getCharacters();
}