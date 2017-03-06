package com.zl.dao.repository;

import com.zl.dao.bean.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 *
 * 在开发中，很少去继承Repository这样的原生接口，添加crud方法。 一般都是继承Repository的实现接口，
 * 如：CrudRepository, PagingAndSortingRepository
 *
 * Created by jacky on 2017/3/6.
 */
@org.springframework.stereotype.Repository
public interface Cat2Repositoty extends Repository<Cat, Integer> {

    /**
     * 1/ 查询方法 以 get | find | read 开头.
     * 2/ 涉及查询条件时，条件的属性用条件关键字连接，要注意的是条件属性以首字母大写。
     */
    //根据catName进行查询 : 根据catName进行查询.
    public Iterable<Cat> findByCatName(String catName);

    /**
     * 如何编写JPQL语句，
     * Hibernate  -- HQL语句.
     * JPQL 语句 和HQL语句是类似的.
     */
    @Query("from Cat where catName=:cn")
    public Iterable<Cat> findMyCatName(@Param("cn")String catName);
}
