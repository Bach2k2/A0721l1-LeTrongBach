package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyExchangeController {
    @GetMapping("/exchange")
    public String showForm(){
        return "money-exchange";
    }


    @RequestMapping(value="/exchange",method =RequestMethod.POST)
    public String exchangeMoney(@RequestParam double usd, @RequestParam double rate, Model model){
        System.out.println(usd);
        System.out.println(rate);
        double vnd=usd*rate;
        model.addAttribute("vnd",vnd);
        return "money-exchange";
    }
}
