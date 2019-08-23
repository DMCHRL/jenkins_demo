package com.hrl.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liang
 * @Date: 2019/8/22 15:09
 */
@RestController
public class HelloController {

    @GetMapping("say")
    public String say(){
        return "hello wold";
    }
}
