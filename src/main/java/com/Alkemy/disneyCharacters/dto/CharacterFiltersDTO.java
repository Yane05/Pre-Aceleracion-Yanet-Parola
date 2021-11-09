package com.Alkemy.disneyCharacters.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CharacterFiltersDTO {

    private String name;
    private Integer age;
    private Long idFilm;

    public CharacterFiltersDTO(String name, Integer age, Long idFilm) {
        this.name = name;
        this.age = age;
        this.idFilm = idFilm;
    }
}
