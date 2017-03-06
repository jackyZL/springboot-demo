package com.zl.service;

import com.zl.dao.bean.Cat;
import com.zl.dao.repository.Cat2Repositoty;
import com.zl.dao.repository.CatRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by jacky on 2017/3/6.
 */
@Service
public class CatService {

    @Resource
    private CatRepository catRepository;

    @Resource
    private Cat2Repositoty cat2Repositoty;

    /**
     * save,update ,delete 方法需要绑定事务.
     *
     * 使用@Transactional进行事务的绑定.
     *
     * @param cat
     */
    @Transactional
    public void save(Cat cat){  // 保存数据
        catRepository.save(cat);
    }

    @Transactional
    public void delete(int id){ // 删除数据
        catRepository.delete(id);
    }

    public Iterable<Cat> getAll(){ // 查询数据
       return  catRepository.findAll();
    }

    public Iterable<Cat> findByCatName(String catName){
        return cat2Repositoty.findByCatName(catName);
    }

    public Iterable<Cat> findByQuery(String catName){
        return cat2Repositoty.findMyCatName(catName);
    }


}
