package edu.wctc.springboottutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/forward-me")
    public String doForward(){
        return "forward:/wood";
    }

    @RequestMapping("/redirect-me")
    public String doRedirect(){
        return "redirect:https://www.youtube.com/watch?v=yhtiKOcZa3E";
    }


    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }
}
