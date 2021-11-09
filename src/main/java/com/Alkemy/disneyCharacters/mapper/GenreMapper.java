package com.Alkemy.disneyCharacters.mapper;

import com.Alkemy.disneyCharacters.dto.GenreDTO;
import com.Alkemy.disneyCharacters.entity.GenreEntity;
import org.springframework.stereotype.Component;

@Component
public class GenreMapper {

    public GenreEntity genreDTO2Entity (GenreDTO dto){
        GenreEntity genreEntity = new GenreEntity();
        genreEntity.setName(dto.getName());
        genreEntity.setImage(dto.getImage());
        genreEntity.setFilms(dto.getFilms());
        return genreEntity;
    }

    public GenreDTO genreEntity2DTO (GenreEntity entity){
        GenreDTO dto = new GenreDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setImage(entity.getImage());
        dto.setFilms(entity.getFilms());
        return dto;
    }
}
