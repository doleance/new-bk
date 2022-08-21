package net.varazslat.bagolyko.core.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "characters")
public class Character {
    @Id @GeneratedValue(strategy = GenerationType.AUTO, generator = "character_id_generator")
    private Long id;

    @NotNull
    @NotBlank
    @Pattern(regexp = "[a-zA-ZíéáűőúöüóäÍÉÁŰŐÚÖÜÓÄ .'-]{2,}")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
