package com.study.controller;

import com.study.domain.MyBean201;
import com.study.domain.MyBean202;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
@RequestMapping("/main20")
public class Controller20 {

    @RequestMapping("/sub1")
    public void sub1() {

    }

    @RequestMapping("/sub2")
    public void sub2() {

    }

    @RequestMapping("/sub3")
    public void sub3() {

    }

    @RequestMapping("/sub4")
    public void sub4() {

    }

    @RequestMapping("/sub5")
    public void sub5(@RequestParam String player, Model model) {
        model.addAttribute("result", player + " 검색 결과");
    }

    @RequestMapping("/sub6")
    public void sub6(@RequestParam String address, @RequestParam String type, Model model) {
        model.addAttribute("address", address + "의 " + type + " 검색 결과");
    }

    @RequestMapping("/sub7")
    public void sub7(@RequestParam String name,
                     @RequestParam Integer age,
                     @RequestParam String birth,
                     @RequestParam String address,
                     @RequestParam String hobby,
                     Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        System.out.println("birth = " + birth);
        if (birth.startsWith("2023")) {
            System.out.println("2024년");
        }
    }

    @RequestMapping("/sub8")
    public void sub8(@ModelAttribute MyBean201 data) {
        System.out.println(data);
    }

    @RequestMapping("/sub9")
    public void sub9() {
        // form 요소 : city, address, title, content
    }

    @RequestMapping("/sub10")
    public void sub10(@ModelAttribute MyBean202 bean) {
    }

    @RequestMapping("/sub11")
    public void sub11() {

    }

    @RequestMapping("/sub12")
    public void sub12(HttpServletRequest request, HttpServletResponse response) {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String type = request.getParameter("type");

        System.out.println(title + " " + content + " " + type);
    }

    @RequestMapping("/sub13")
    public void sub13(@RequestParam String city) {
        System.out.println("city = " + city);
    }

    @RequestMapping("/sub14")
    public void sub14(@RequestParam String[] foods) {
        System.out.println(Arrays.toString(foods));
    }

    @ResponseBody
    @RequestMapping("/sub15")
    public String sub15(@RequestParam String type,
                        @RequestParam String phone,
                        @RequestParam String[] book) {
        System.out.println("type = " + type);
        System.out.println("phone = " + phone);
        System.out.println("book = " + Arrays.toString(book));
        return "ok";
    }

    @RequestMapping("/sub16")
    public void sub16() {

    }

    @RequestMapping("/sub17")
    public void sub17(String id, String password, String info) {
        System.out.println("id = " + id);
        System.out.println("password = " + password);
        System.out.println("info = " + info);
    }

    @RequestMapping("/sub18")
    public void sub18(String name, Integer age, String address) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("address = " + address);
    }
}
