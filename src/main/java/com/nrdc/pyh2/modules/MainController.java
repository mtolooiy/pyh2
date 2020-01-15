package com.nrdc.pyh2.modules;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("")
    public String index(){
        return ("index");
    }

    @RequestMapping("/users")
    public String users(){
        return ("users");
    }

}
