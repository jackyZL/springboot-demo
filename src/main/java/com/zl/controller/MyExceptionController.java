package com.zl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jacky on 2017/3/6.
 */
@RestController
@RequestMapping("/global")
public class MyExceptionController {

    @RequestMapping("/error")
    public void error(){
        int i = 1/0;
    }
}
