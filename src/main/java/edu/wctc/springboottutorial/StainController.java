package edu.wctc.springboottutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StainController {

    @RequestMapping("/stain")
    public String showStainPage(){
        return "pages/StepTwo";
    }
}




