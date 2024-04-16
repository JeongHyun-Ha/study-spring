package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

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
    public String method4(String id, String password,
                          RedirectAttributes rttr) {
        boolean ok = id.equals(password);
        // 로그인 성공 시
        // 성공 후 보여주는 페이지로 이동
        if (ok) {
            rttr.addAttribute("status", "login");
            return "redirect:/main22/sub5";
        } else {
            // 로그인 실패 시
            // 로그인 form 있는 페이지로 이동
            rttr.addAttribute("status", "fail");
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
    public String method7(String id, String password, RedirectAttributes rttr) {
        boolean ok = id.equals(password);
        // 로그인 성공 시
        // 성공 후 보여주는 페이지로 이동
        if (ok) {
            rttr.addAttribute("status", "ok");
            return "redirect:/main22/sub8";
        } else {
            // 로그인 실패 시
            // 로그인 form 있는 페이지로 이동
            rttr.addAttribute("status", "fail");
            return "redirect:/main22/sub6";
        }
    }

    @ResponseBody
    @GetMapping("sub8")
    public String method8() {
        return "로그인 성공";
    }

    @GetMapping("sub9")
    public String method9(RedirectAttributes rttr) {
        String condition = "";
        if (Math.random() < 0.5) {
            condition = "ok";
        } else {
            condition = "fail";
        }
        rttr.addAttribute("condition", condition);
        rttr.addAttribute("type", "soccer");
        rttr.addAttribute("address", "신촌");

        return "redirect:/main22/sub10";
    }

    @GetMapping("sub10")
    public void method10(String condition) {
        System.out.println("condition = " + condition);
    }

    @GetMapping("sub11")
    public String method11(RedirectAttributes rttr) {
        //redirection 시 정보 전달은 RedirectAttributes 활용
        // addAttribute : 쿼리 스트링에 붙음
        rttr.addAttribute("type", "soccer");
        // addFlashAttribute : 모델에 붙음
        rttr.addFlashAttribute("attr1", List.of("car", "food", "phone"));

        return "redirect:/main22/sub12";
    }

    @GetMapping("sub12")
    public void method12(@ModelAttribute("attr1") List<String> attr1) {
        System.out.println("attr1 = " + attr1);
    }

    @GetMapping("sub13")
    public void method13() {

    }

    @PostMapping("sub14")
    public String method14(String id, String password,
                           RedirectAttributes rttr) {
        boolean status = id.equals(password);
        if (status) {
            // 로그인 성공 시
            rttr.addFlashAttribute("message", "로그인 성공하였습니다.");
            return "redirect:/main22/sub15";
        } else {
            // 로그인 실패 시
            rttr.addFlashAttribute("message", "아이디와 패스워드를 확인해주세요.");
            return "redirect:/main22/sub13";
        }
    }

    @GetMapping("sub15")
    public void method15() {

    }
}

