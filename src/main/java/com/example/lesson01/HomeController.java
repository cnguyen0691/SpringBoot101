package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @RequestMapping("/Crabby")
    public String Crabby (){
        return "Crabby";
    }
    @RequestMapping("/index")
    public String homepage(){
        return "index";
    }
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping("/event")
    public String event(){
        return "event";
    }
    @RequestMapping("/traveling")
    public String traveling(){
        return "traveling";
    }
    @RequestMapping("/social")
    public String social(){
        return "social";
    }

}
