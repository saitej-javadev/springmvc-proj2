package com.saitej.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String showHome() {
        return "home";
    }

    @RequestMapping("/contact")
    public String showContactUS() {
        return "contact";
    }

    //using ModelAndView
    @RequestMapping("/date")
    public ModelAndView getDate(){
        return new ModelAndView("home","date", new Date());
    }

    //using Model
    @RequestMapping("/info")
    public String getInfo(Model model){
        model.addAttribute("page","This is Info Page");
        model.addAttribute("time",LocalDateTime.now());
        model.addAttribute("cars", Arrays.asList("Tesla","Bmw","Ferrari","Porsche"));
        model.addAttribute("movies", Arrays.asList("Inception","Interstellar","Dunkrik","Tenet"));
        return "info";
    }
}
