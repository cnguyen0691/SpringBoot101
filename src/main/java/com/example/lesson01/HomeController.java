package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @RequestMapping("/")
    public String homepage(){
        return "index";
    }
    @RequestMapping("/Crabby")
    public String Crabby (){
        return "Crabby";
    }

}
