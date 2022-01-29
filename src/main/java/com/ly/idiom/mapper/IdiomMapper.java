package com.ly.idiom.mapper;

import com.ly.idiom.model.idiom.IdiomDto;
import com.ly.idiom.model.idiom.TbIdiom;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdiomMapper {


    @Select("select * from tb_idiom where id=#{id}")
    TbIdiom getOneById(int id);

    @Insert("insert into tb_idiom(answer,group_id,img_url,status) values (#{answer},#{groupId},#{imgUrl},1)")
    void insert(IdiomDto dto);

    @Select("select * from tb_idiom")
    List<TbIdiom> findPages();
}
