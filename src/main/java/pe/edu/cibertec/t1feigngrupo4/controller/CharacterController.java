package pe.edu.cibertec.t1feigngrupo4.controller;

import pe.edu.cibertec.t1feigngrupo4.model.CharacterRM;
import pe.edu.cibertec.t1feigngrupo4.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/characters")
    public List<CharacterRM> obtenerPersonajes() {
        return characterService.obtenerPersonajes();
    }
}