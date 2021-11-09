package com.Alkemy.disneyCharacters.service.impl;

import com.Alkemy.disneyCharacters.dto.GenreDTO;
import com.Alkemy.disneyCharacters.entity.GenreEntity;
import com.Alkemy.disneyCharacters.mapper.GenreMapper;
import com.Alkemy.disneyCharacters.repository.GenreRepository;
import com.Alkemy.disneyCharacters.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreMapper genreMapper;
    @Autowired
    private GenreRepository genreRepository;

    public GenreDTO save (GenreDTO dto){
        GenreEntity entity = genreMapper.genreDTO2Entity(dto);
        GenreEntity entitySaved = genreRepository.save(entity);
        GenreDTO result = genreMapper.genreEntity2DTO(entitySaved);
        return result;
    }
}
