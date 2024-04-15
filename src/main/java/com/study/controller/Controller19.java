package com.study.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main19")
public class Controller19 {

    @RequestMapping("sub1")
    public void sub1() {

    }

    @RequestMapping("sub2")
    public void sub2(HttpSession session) {
        session.setAttribute("attr", "value");
        System.out.println("Controller19.sub2");
    }

    @RequestMapping("sub3")
    public void sub3(HttpSession session) {
        Object attr = session.getAttribute("attr");
        System.out.println("attr = " + attr);
    }

    @RequestMapping("sub4")
    public void sub4(@RequestParam String name,
                     HttpSession session) {
        session.setAttribute("name", name);
    }

    @RequestMapping("sub5")
    public void sub5(HttpSession session) {
        Object name = session.getAttribute("name");
        System.out.println("name = " + name);
    }
}
