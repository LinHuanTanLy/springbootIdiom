package com.ly.idiom.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ly.idiom.model.idiom.IdiomDto;
import com.ly.idiom.model.idiom.TbIdiom;
import com.ly.idiom.net.Response;
import com.ly.idiom.service.IdiomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/idiom")
public class IdiomController {

    @Autowired
    private IdiomService service;


    @PostMapping("getById")
    public Response<TbIdiom> findOne(Integer id) {
        if(id==null){
            return Response.fail("id不能为null");
        }
        TbIdiom tbIdiom = service.getOne(id);
        if (tbIdiom != null) {
            return Response.ok(tbIdiom);
        } else {
            return Response.fail("查询失败");
        }
    }

    @PostMapping("insertOne")
    public Response<String> insertOne(IdiomDto dto){
        try{
            service.addOne(dto);
            return Response.ok("添加成功");
        }   catch (Exception e){
            return Response.fail("添加失败");
        }
    }

    @PostMapping("find")
    public Response<List<TbIdiom>> find( int pageSize,int pageNum){
        System.out.println("the pageSize is "+pageSize);
        System.out.println("the pageNum is "+pageNum);
        PageHelper.startPage(pageNum,pageSize);
        List<TbIdiom> list=service.find();
        PageInfo<TbIdiom> pageInfo= new PageInfo<>(list);
        List<TbIdiom> resultList= pageInfo.getList();
        return Response.ok(resultList);
    }

}
