package pe.edu.cibertec.t1feigngrupo4.service;

import pe.edu.cibertec.t1feigngrupo4.client.CharacterClient;
import pe.edu.cibertec.t1feigngrupo4.model.CharacterRM;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private final CharacterClient characterClient;

    public CharacterService(CharacterClient characterClient) {
        this.characterClient = characterClient;
    }

    public List<CharacterRM> obtenerPersonajes() {
        return characterClient.getCharacters()
                .getResults()
                .stream()
                .filter(character -> character.getStatus().equals("Alive"))
                .filter(character -> character.getSpecies().equals("Human"))
                .toList();
    }
}