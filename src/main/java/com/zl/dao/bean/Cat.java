package com.zl.dao.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 创建了一个实体类。
 *
 * 如何持久化呢？
 *
 * 1、使用@Entity进行实体类的持久化操作，当JPA检测到我们的实体类当中有
 *
 * @Entity 注解的时候，会在数据库中生成对应的表结构信息。
 *
 *
 * 如何指定主键以及主键的生成策略？
 *
 * 2、使用@Id指定主键.
 *
 *
 * Created by jacky on 2017/3/6.
 */
@Entity
public class Cat {

    /**
     * 使用@Id指明主键，
     * 使用 @GeneratedValue(strategy = GenerationType.AUTO) 指明主键生成策略
     * mysql默认的是自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; // 主键

    private String catName;

    private int catAge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }
}
