package Mudi.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String Hello(Model model){
        model.addAttribute("nome", "Mundo");
        return "hello";

    }

}
