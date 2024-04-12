package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main15")
public class Controller15 {

    @RequestMapping("/sub1")
    public String method1() {
        return "/main15/sub1";
    }

    @RequestMapping("/sub2")
    public String method2() {
        return "/main15/sub2";
    }

    @RequestMapping("/sub3")
    public String method3() {
        return "/main15/sub3";
    }

    @RequestMapping("/sub4")
    public String method4() {
        return "/main15/sub4";
    }

    @RequestMapping("/sub5")
    public String method5() {
        return "/main15/sub5";
    }

    @RequestMapping("/sub6")
    public String method6() {
        return "/main15/sub6";
    }

    @RequestMapping("/sub7")
    public String method7() {
        return "/main15/sub7";
    }

    @RequestMapping("/sub8")
    public String method8() {
        return "/main15/sub8";
    }

    @RequestMapping("/sub9")
    public void method9() {
    }

    @RequestMapping("/sub10")
    public void method10() {
    }

    @RequestMapping("/sub11")
    public void method11() {
    }
}
