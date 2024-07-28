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


    @RequestMapping("/about")
    public String aboutPage(Model model){
       // model.addAttribute("isLogin",true);
        model.addAttribute("isLogin",false);
        System.out.println("About page loading");
        return "about";
    }

    @RequestMapping("/services")
    public String ServicesPage(){
        System.out.println("Services page loading");
        return "services";
    }

    @RequestMapping("/register")
    public String RegisterPage(){
        System.out.println("SignUp page loading");
        return "register";
    }

    @RequestMapping("/login")
    public String LoginPage(){
        System.out.println("Login page loading");
        return "login";
    }

    @RequestMapping("/contact")
    public String contact(){
        System.out.println("Contact page loading");
        return "contact";
    }



}
