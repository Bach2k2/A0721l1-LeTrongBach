package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CodimentController {
    @GetMapping(value = "/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@RequestParam("condiments") String[] condiments,Model model) {
        String result="";
        for(String condiment:condiments)
        {
            result+=condiment+",";
        }
        result=result.substring(0,result.length()-1);
        model.addAttribute("result",result);
        return "result";
    }
}
