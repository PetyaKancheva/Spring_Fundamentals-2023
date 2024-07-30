package bg.softuni.bikes_shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO check REst controller

@Controller
public class homeController {
    @GetMapping("/")
    private String index(){
        return "index";
    }

    @GetMapping("/about")
    private String about(){
        return "about";
    }

}