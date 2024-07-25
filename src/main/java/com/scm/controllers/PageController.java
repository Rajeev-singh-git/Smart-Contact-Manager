package com.scm.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page Loaded");

        //sending data to view
        model.addAttribute("Name", "Rajeev Tech");
        model.addAttribute("GithubRepo", "https://github.com/Rajeev-singh-git");
        return "home";
    }

}
