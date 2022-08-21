package net.varazslat.bagolyko.core.controller;

import net.varazslat.bagolyko.core.model.Character;
import net.varazslat.bagolyko.core.service.CharacterService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public List<Character> getCharacters() {
        return characterService.findAll();
    }

    @PostMapping
    public Character createCharacter(@Valid @RequestBody Character character) {
        return characterService.save(character);
    }

}
