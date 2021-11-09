package com.Alkemy.disneyCharacters.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FilmFiltersDTO {

    private String name;
    private Long idGenre;
    private String order;

    public FilmFiltersDTO(String name, Long idGenre, String order) {
        this.name = name;
        this.idGenre = idGenre;
        this.order = order;
    }
    public boolean isASC() {
        return this.order.compareToIgnoreCase("ASC") == 0;
    }
}
