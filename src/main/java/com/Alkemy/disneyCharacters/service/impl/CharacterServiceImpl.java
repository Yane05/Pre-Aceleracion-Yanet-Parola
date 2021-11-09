package com.Alkemy.disneyCharacters.service.impl;

import com.Alkemy.disneyCharacters.dto.CharacterDTO;
import com.Alkemy.disneyCharacters.dto.GenreDTO;
import com.Alkemy.disneyCharacters.entity.CharacterEntity;
import com.Alkemy.disneyCharacters.entity.GenreEntity;
import com.Alkemy.disneyCharacters.mapper.CharacterMapper;
import com.Alkemy.disneyCharacters.mapper.FilmMapper;
import com.Alkemy.disneyCharacters.repository.CharacterRepository;
import com.Alkemy.disneyCharacters.repository.FilmRepository;
import com.Alkemy.disneyCharacters.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterMapper characterMapper;
    @Autowired
    private CharacterRepository characterRepository;

    public CharacterDTO save (CharacterDTO dto){
        CharacterEntity entity = characterMapper.characterDTO2Entity(dto);
        CharacterEntity entitySaved = characterRepository.save(entity);
        CharacterDTO result = characterMapper.characterEntity2DTO(entitySaved);
        return result;
    }
}
