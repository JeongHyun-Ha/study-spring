package com.study.controller;

import com.study.domain.MyBean091;
import com.study.domain.MyBean092;
import com.study.domain.MyBean093;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main9")
public class Controller09 {

    @RequestMapping("sub1")
    public void sub1(Model model) {
        MyBean091 myBean09 = new MyBean091();
        model.addAttribute("person", myBean09);
    }

    @RequestMapping("sub2")
    public void sub2(Model model) {
        MyBean092 bean1 = new MyBean092();
        bean1.setName("손흥민");
        bean1.setAge(33);

        MyBean092 bean2 = new MyBean092();
        bean2.setName("이강인");
        bean2.setAge(25);

        model.addAttribute("person", bean1);
        model.addAttribute("person2", bean2);
    }

    @RequestMapping("sub3")
    public void sub3(Model model) {
        MyBean093 bean1 = new MyBean093();
        bean1.setAge(20);
        bean1.setAddress("신촌");
        bean1.setCity("서울");

        MyBean093 bean2 = new MyBean093();
        bean2.setAge(30);
        bean2.setAddress("해운대");
        bean2.setCity("부산");

        model.addAttribute("member1", bean1);
        model.addAttribute("member2", bean2);

        int a = 5;
        String.valueOf(a).contains("5");
    }
}
