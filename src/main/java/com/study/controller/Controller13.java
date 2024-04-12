package com.study.controller;

import com.study.domain.MyBean123;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main13")
public class Controller13 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        MyBean123 obj1 = new MyBean123("신촌", "서울", 30);
        model.addAttribute("obj1", obj1);
    }

    @RequestMapping("sub2")
    public void method2(Model model) {

    }
}
