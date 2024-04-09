package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main12")
public class Controller12 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("age", 20);
        model.addAttribute("products", List.of("Apple", "Banana"));
//        model.addAttribute("products", List.of());
//        model.addAttribute("member",
//                Map.of("country", "korea",
//                        "age", 30));

//        model.addAttribute("member",
//                Map.of("country", "korea",
//                        "age", 15));
//
        model.addAttribute("member",
                Map.of("country", "us",
                        "age", 40));
//
//        model.addAttribute("member",
//                Map.of("country", "korea",
//                        "age", 15));
    }
}
