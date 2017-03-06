package com.zl.controller;

import com.zl.dao.DemoBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by jacky on 2016/12/24.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json;chartset=UTF-8")
    public DemoBean say(){

        DemoBean demoBean = new DemoBean();
        demoBean.setId(1);
        demoBean.setName("jacky2");
        demoBean.setCreateTime(new Date());
        return demoBean;
    }

    @RequestMapping(value = "/bybe", method = RequestMethod.GET, produces = "application/json;chartset=UTF-8")
    public DemoBean sayBybe(){

        DemoBean demoBean = new DemoBean();
        demoBean.setId(1);
        demoBean.setName("jacky-bybe");
        demoBean.setCreateTime(new Date());
        return demoBean;
    }

    @RequestMapping(value = "/good", method = RequestMethod.GET, produces = "application/json;chartset=UTF-8")
    public DemoBean good(){
        DemoBean demoBean = new DemoBean();
        demoBean.setId(1);
        demoBean.setName("jacky-good");
        demoBean.setCreateTime(new Date());
        return demoBean;
    }




}
