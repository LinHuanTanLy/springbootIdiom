package com.ly.idiom.service;

import com.ly.idiom.mapper.IdiomMapper;
import com.ly.idiom.model.idiom.IdiomDto;
import com.ly.idiom.model.idiom.TbIdiom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IdiomService {
    @Autowired
    IdiomMapper idiomMapper;


    public void addOne(IdiomDto dto) {
        idiomMapper.insert(dto);
    }

    public TbIdiom getOne(int id){
        return idiomMapper.getOneById(id);
    }

    public List<TbIdiom> find(){
        return idiomMapper.findPages();
    }
}
