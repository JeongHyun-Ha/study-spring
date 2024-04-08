package com.study.controller;

import jakarta.servlet.ServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("main7")
public class Controller07 {

    @RequestMapping("sub1")
    public void method1(String search, ServletResponse response) throws IOException {
        // 검색하는 일...

//        String result = search + " 키워드 검색 결과";
        String result = STR."""
                <div style="display:flex;
                    justify-content: center;
                    align-items: center;">
                    <div style="padding: 10px; background-color: skyblue;">
                        \{search} + 키워드 검색 결과
                    </div>
                </div>
                """;
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(result);
    }
}
