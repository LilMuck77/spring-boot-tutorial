package edu.wctc.springboottutorial;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WoodController {

    @RequestMapping("/wood")
    public String showWoodPage(){
        return "pages/StepOne";
    }


}
