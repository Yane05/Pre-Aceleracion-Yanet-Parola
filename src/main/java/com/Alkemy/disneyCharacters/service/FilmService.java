package com.Alkemy.disneyCharacters.service;

import com.Alkemy.disneyCharacters.dto.FilmBasicDTO;
import com.Alkemy.disneyCharacters.dto.FilmDTO;

import java.util.List;

public interface FilmService {

    public FilmDTO save (FilmDTO dto);

    List<FilmBasicDTO> getAllFilms();

    List<FilmDTO> getAllFilmsDetailed();

    void delete(Long id);

    FilmDTO update(Long id, FilmDTO filmDTO);

    List<FilmDTO> getByFilters(String name, Long idGenre, String order);
}
