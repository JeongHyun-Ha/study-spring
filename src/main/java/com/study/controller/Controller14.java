package com.study.controller;

import com.study.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;

import java.util.List;

@Controller
@RequestMapping("main14")
public class Controller14 {

    private final BeanNameUrlHandlerMapping beanNameHandlerMapping;

    public Controller14(BeanNameUrlHandlerMapping beanNameHandlerMapping) {
        this.beanNameHandlerMapping = beanNameHandlerMapping;
    }

    @RequestMapping("sub1")
    public void method1(Model model) {
        MyBean141 o1 = new MyBean141("신촌", "한국", 33, "흥민");
        MyBean142 o2 = new MyBean142();

        o2.setName("강인");
        o2.setId("19");
        o2.setAge(22);

        model.addAttribute("O1", o1);
        model.addAttribute("O2", o2);
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        MyBean142 o1 = new MyBean142();
        MyBean142 o2 = new MyBean142();
        o1.setName("김민재");
        o2.setName("이정후");
        System.out.println("Controller14.method2");

        // 좋은 습관은 이름을 직접 작성하는 것.
        model.addAttribute(o1);
        model.addAttribute(List.of(o1, o2));
    }

    @RequestMapping("sub3")
    public void sub3(@ModelAttribute("player1") MyBean142 o1) {
        o1.setName("오타니");
    }

    @RequestMapping("sub4")
    public String sub4(@ModelAttribute MyBean142 o1) {
        o1.setName("김민재");

        return "/main14/sub3";
    }

    @RequestMapping("sub5")
    public String sub5(MyBean142 o1) {

        o1.setName("유재석");
        return "/main14/sub3";
    }

    @RequestMapping("sub6")
    public void sub6(@ModelAttribute("username") MyBean142 o1) {
        o1.setName("카리");
    }

    @RequestMapping("sub7")
    public String sub7(MyBean143 o1) {
        System.out.println("Controller14.sub7");
        o1.setAddress("서울");
        return "/main14/sub6";
    }

    @RequestMapping("sub8")
    public void sub8(MyBean144 o1) {
        System.out.println(o1);
    }

    @RequestMapping("sub9")
    public String sub9(
            @RequestParam("name") String name,
            @RequestParam("address") String address,
            @RequestParam("age") Integer age,
            Model model) {
        MyBean145 o1 = new MyBean145();
        o1.setName(name);
        o1.setAddress(address);
        o1.setAge(age);

        model.addAttribute("myBean145", o1);
        return "/main14/sub9";
    }

    @RequestMapping("sub10")
    public String sub10(@ModelAttribute MyBean145 o1) {
        System.out.println("o1.getName() = " + o1.getName());
        System.out.println("o1.getAddress() = " + o1.getAddress());
        System.out.println("o1.getAge() = " + o1.getAge());
        return "/main14/sub9";
    }

    @RequestMapping("sub11")
    public String sub11(@ModelAttribute("user") MyBean146 o1) {
        return "/main14/sub11";
    }

    @RequestMapping("sub12")
    public void sub12(MyBean147 o1) {
        System.out.println(o1);
    }
}
