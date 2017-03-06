package org.zl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 注意： 这个controller扫描不了。
 * 只能扫描到 @SpringBootApplication 同包或者子包下的类
 *
 * Created by h on 2017/3/6.
 */
@RestController
public class Hello3Controller {

    @RequestMapping("/hello3")
    public String hello3(){
        return "hello3";
    }
}
