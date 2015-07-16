package org.madrona.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String showIndexPage(){
        return "index";
    }

    @RequestMapping("/login")
    public String showLoginPage(){
        return "login";
    }
}
