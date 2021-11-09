package com.Alkemy.disneyCharacters.service;

import com.Alkemy.disneyCharacters.dto.CharacterBasicDTO;
import com.Alkemy.disneyCharacters.dto.CharacterDTO;

import java.util.List;

public interface CharacterService {

    public CharacterDTO save (CharacterDTO dto);

    List<CharacterBasicDTO> getAllIcons();

    List<CharacterDTO> getAllIconsDetailed();

    void delete(Long id);

    CharacterDTO update(Long id, CharacterDTO characterDTO);

    List<CharacterDTO> getByFilters(String name, Integer age, Long idFilm);
}
