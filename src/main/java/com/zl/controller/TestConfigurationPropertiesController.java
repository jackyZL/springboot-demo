package com.zl.controller;

import com.zl.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jacky on 2016/12/24.
 */
@RestController
public class TestConfigurationPropertiesController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String hello(){
        return girlProperties.getCupSize();
    }
}
