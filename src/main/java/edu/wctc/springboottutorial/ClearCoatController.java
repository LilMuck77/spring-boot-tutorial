package edu.wctc.springboottutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ClearCoatController {
    @RequestMapping("/clear-coat")
    public String showClearCoatPage(){
        return "pages/StepThree";
    }
}

