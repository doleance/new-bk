package net.varazslat.bagolyko.core.service;

import net.varazslat.bagolyko.core.model.Character;
import net.varazslat.bagolyko.core.repository.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<Character> findAll() {
        return characterRepository.findAll();
    }

    public Character save(Character character) {
        return characterRepository.save(character);
    }
}
