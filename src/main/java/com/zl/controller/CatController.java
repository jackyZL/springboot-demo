package com.zl.controller;

import com.zl.dao.bean.Cat;
import com.zl.service.CatService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by jacky on 2017/3/6.
 */
@RestController
@RequestMapping("/cat")
public class CatController {

    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save(){
        Cat cat = new Cat();
        cat.setCatName("jack");
        cat.setCatAge(3);
        catService.save(cat);
        return "save ok.";
    }

    @RequestMapping("/delete")
    public String delete(){
        catService.delete(1);
        return "delete ok";
    }

    @RequestMapping(value = "/getAll", produces = "application/json;chartset=UTF-8")
    public Iterable<Cat> getAll(){
        return catService.getAll();

    }

    @RequestMapping(value = "/{catName}", produces = "application/json;chartset=UTF-8")
    public Iterable<Cat> findByCatName(@PathVariable String catName){
        return catService.findByCatName(catName);
    }

    @RequestMapping(value = "/v2/{catName}", produces = "application/json;chartset=UTF-8")
    public Iterable<Cat> findByQuery(@PathVariable String catName){
        return catService.findByQuery(catName);
    }

}
