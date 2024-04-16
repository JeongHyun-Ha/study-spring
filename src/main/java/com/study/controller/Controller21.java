package com.study.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main21")
@Slf4j
public class Controller21 {

    @RequestMapping(value = "sub1",
            method = {RequestMethod.GET, RequestMethod.POST})
    public void method1() {
        log.info("Controller21.method1");
    }

    @RequestMapping("sub2")
    public void method2() {

    }

    @GetMapping("sub3")
    public void method3() {
        log.info("Controller21.method3.GET 방식");
    }

    @PostMapping("sub3")
    public void method4() {
        log.info("Controller21.method4.Post 방식");
    }

    @GetMapping("sub4")
    public void method5() {
        log.info("method5.GET");
    }

    @PostMapping("sub4")
    public void method6() {
        log.info("method6.POST");
    }

    @GetMapping("sub5")
    public void method7() {
        log.info("method7.GET");
    }

    @PostMapping("sub5")
    public void method8() {
        log.info("method8.POST");
    }

}
