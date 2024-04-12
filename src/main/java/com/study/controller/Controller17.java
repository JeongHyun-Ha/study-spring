package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main17")
public class Controller17 {

    @RequestMapping("sub1")
    public void method1() {
        // session : 한 브라우저의 요청들(request)이 공유하는 객체

    }
}
