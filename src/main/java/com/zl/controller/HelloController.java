package com.zl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jacky on 2016/12/24.
 */
@RestController
public class HelloController {

    @Value("${girl.cupSize}")
    private String cupSize;

    @Value("${girl.age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(){
        return content;
    }


}
