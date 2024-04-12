package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main16")
public class Controller16 {

    @RequestMapping("sub1")
    public void method1() {
    }

    @RequestMapping("sub2")
    public String method2() {
        return "/main16/main/sub2";
    }
}
