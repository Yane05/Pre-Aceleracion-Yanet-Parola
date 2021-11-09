package com.Alkemy.disneyCharacters.service.impl;

import com.Alkemy.disneyCharacters.dto.FilmDTO;
import com.Alkemy.disneyCharacters.entity.FilmEntity;
import com.Alkemy.disneyCharacters.mapper.FilmMapper;
import com.Alkemy.disneyCharacters.repository.FilmRepository;
import com.Alkemy.disneyCharacters.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;
    @Autowired
    private FilmRepository filmRepository;

    public FilmDTO save(FilmDTO dto) {
        FilmEntity entity = filmMapper.filmDTO2Entity(dto);
        FilmEntity entitySaved = filmRepository.save(entity);
        FilmDTO result = filmMapper.filmEntity2DTO(entitySaved);
        return result;
    }
}
