package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main22")
public class Controller22 {

    @GetMapping("sub1")
    public String sub1() {
        return "/main22/sub1";
    }

    @GetMapping("sub2")
    public String sub2() {
        // redirect
        // 브라우저는 302 응답을 받으면
        // Location 헤더에 잇는 값으로 다시 요청을 보냄
        return "redirect:/main22/sub1";
    }

    @GetMapping("sub3")
    public void method3() {
        // login form 있는 jsp (view)로 forward
    }

    @PostMapping("sub4")
    public String method4(String id, String password) {
        boolean ok = id.equals(password);
        // 로그인 성공 시
        // 성공 후 보여주는 페이지로 이동
        if (ok) {
            return "redirect:/main22/sub5";
        } else {
            // 로그인 실패 시
            // 로그인 form 있는 페이지로 이동
            return "redirect:/main22/sub3";
        }
    }

    @ResponseBody
    @GetMapping("sub5")
    public String method5() {
        return "로그인 성공";
    }

    @GetMapping("sub6")
    public void method6() {
        // login form 있는 jsp (view)로 forward
    }

    @PostMapping("sub6")
    public String method7(String id, String password) {
        boolean ok = id.equals(password);
        // 로그인 성공 시
        // 성공 후 보여주는 페이지로 이동
        if (ok) {
            return "redirect:/main22/sub8";
        } else {
            // 로그인 실패 시
            // 로그인 form 있는 페이지로 이동
            return "redirect:/main22/sub6";
        }
    }

    @ResponseBody
    @GetMapping("sub8")
    public String method8() {
        return "로그인 성공";
    }
}
