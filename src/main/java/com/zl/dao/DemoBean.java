package com.zl.dao;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by jacky on 2017/3/6.
 */
public class DemoBean {

    @JSONField(name = "name")
    private String name;

    @JSONField(name = "id")
    private Integer id;

    @JSONField(name = "create_time",format = "yyyy-MM-hh HH:mm:ss")
    private Date createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
