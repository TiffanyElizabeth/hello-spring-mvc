package org.lessons.spring.hello_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import java.time.LocalTime;

@Controller
@RequestMapping("/hello")
public class GreetingController {
    @GetMapping("/hello")
    public String greeting(Model model, @RequestParam(name = "name") String name) {
        model.addAttribute("name", name);
        model.addAttribute("time", LocalTime.now());

        return "greeting";
    }
}
