package com.studyuser.member.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello 1a info!";
    }

    @PostMapping("/join")
    public String join() {
        return "String";
    }
}
