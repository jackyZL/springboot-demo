package com.zl.controller;

import com.zl.dao.DemoBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by jacky on 2017/3/6.
 */
@RestController
public class SayController {

    @RequestMapping(value = "/say", method = RequestMethod.GET, produces = "application/json;chartset=UTF-8")
    public DemoBean good(){
        DemoBean demoBean = new DemoBean();
        demoBean.setId(1);
        demoBean.setName("jacky-say-good");
        demoBean.setCreateTime(new Date());
        return demoBean;
    }
}
