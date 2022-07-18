package com.clitubemgnt.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tubes")
public class TubeController {

    @GetMapping
    public String tubes(){
        return "tubes";
    }

    @GetMapping("/add")
    public String addTube(){ return "add-tube";}

}
