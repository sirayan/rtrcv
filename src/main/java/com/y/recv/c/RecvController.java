package com.y.recv.c;

import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class RecvController {

    @GetMapping(value = "/rtrcv")
    public String indexPage() {

        return "index";
    }

    @GetMapping(value = { "/", "/home" })
    public String homePage() {

        return "home";
    }

}
