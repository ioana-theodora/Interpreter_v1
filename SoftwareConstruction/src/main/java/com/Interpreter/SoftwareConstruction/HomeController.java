package com.Interpreter.SoftwareConstruction;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Toshiba on 28/02/2018.
 */

@Controller
public class HomeController {
    private static final String appName = "Interpreter";

    @GetMapping("/")
    public String home(Model model, @RequestParam(value = "name", required = false, defaultValue = "Guest") String name) {
        model.addAttribute("name", name);
        model.addAttribute("title", appName);
        return "home";
    }

    @PostMapping("/")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return null; //TODO Change null when you know what the fuck you want!
    }
}