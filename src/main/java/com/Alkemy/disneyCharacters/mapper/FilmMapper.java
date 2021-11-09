package com.Alkemy.disneyCharacters.mapper;

import com.Alkemy.disneyCharacters.dto.CharacterDTO;
import com.Alkemy.disneyCharacters.dto.FilmDTO;
import com.Alkemy.disneyCharacters.entity.CharacterEntity;
import com.Alkemy.disneyCharacters.entity.FilmEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class FilmMapper {
    public FilmEntity filmDTO2Entity(FilmDTO dto) {
        FilmEntity filmEntity = new FilmEntity();
        filmEntity.setImage(dto.getImage());
        filmEntity.setTitle(dto.getTitle());
        filmEntity.setCreationDate(string2LocalDate(dto.getCreationDate()));
        filmEntity.setQualification(dto.getQualification());
        filmEntity.setGenres(dto.getGenres());
        filmEntity.setCharacters(dto.getCharacters());
        return filmEntity;
    }

    public FilmDTO filmEntity2DTO(FilmEntity entity) {
        FilmDTO dto = new FilmDTO();
        dto.setId(entity.getId());
        dto.setImage(entity.getImage());
        dto.setTitle(entity.getTitle());
        dto.setCreationDate(entity.getCreationDate().toString());
        dto.setQualification(entity.getQualification());
        dto.setGenres(entity.getGenres());
        dto.setCharacters(entity.getCharacters());
        return dto;
    }

    private LocalDate string2LocalDate(String stringDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(stringDate, formatter);
        return date;
    }
}
