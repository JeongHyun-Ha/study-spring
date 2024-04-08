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

    // /main7/sub2
    @RequestMapping("sub2")
    public String method2() {
        // 요청 정보 분석|가공
        // 비즈니스 로직 처리
        // 결과를 모델에 담기
        // View 로 포워딩(View 이름 리턴)

        return "view1";
    }

    @RequestMapping("sub3")
    public String method3() {
        return "view2";
        // /WEB-INF/jsp/view2.jsp
    }

    @RequestMapping("sub4")
    public String method4() {
        return "view3";
    }

    @RequestMapping("sub5")
    public String method5() {
        return "/main7/sub5";
    }

    @RequestMapping("sub6")
    public String method6() {
        return null;
    }

    @RequestMapping("sub7")
    public void method7() {

    }

    @RequestMapping("sub8")
    public void method8() {
        System.out.println("Controller07.method8");
    }
}
