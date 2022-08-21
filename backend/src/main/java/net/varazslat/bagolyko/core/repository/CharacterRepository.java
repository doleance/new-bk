package net.varazslat.bagolyko.core.repository;

import net.varazslat.bagolyko.core.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

}
