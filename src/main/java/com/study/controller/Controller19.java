package com.study.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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

    @RequestMapping("sub6")
    public void sub6(HttpServletResponse response) {
        Cookie cookie = new Cookie("name", "value");
        response.addCookie(cookie);

        // jsp forward
    }

    @RequestMapping("sub7")
    public void sub7(HttpServletResponse response) {
        Cookie cookie = new Cookie("cookie", "ImCookie");
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        response.addCookie(cookie);
    }

    @RequestMapping("sub8")
    public void sub8(HttpServletResponse response) {
        Cookie cookie = new Cookie("sub", "cookie-sub8-1");
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        // cookie 생명 주기 결정
        cookie.setMaxAge(3);
        response.addCookie(cookie);
    }

    @RequestMapping("sub9")
    public void sub9(HttpServletResponse response) {
        Cookie cookie = new Cookie("sub9", "cookie-sub9");
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        // cookie 생명 주기 결정
        cookie.setMaxAge(60);
        response.addCookie(cookie);
    }

    @RequestMapping("sub10")
    public void sub10(HttpServletRequest request,
                      HttpServletResponse response) {
        // cookie 지우기
        // 1. 요청에서 쿠키 얻기
        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;
        // 2. 쿠키의 지속시간 0으로 세팅
        // 3. 쿠키를 응답에 추가
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("cookie")) {
                    cookie = c;
                }
            }
        }
        if (cookie != null) {
            cookie.setPath("/");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
    }
}
