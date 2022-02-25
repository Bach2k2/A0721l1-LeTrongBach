package controller;

import model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {
    @GetMapping("/setting")
    public ModelAndView showSetting(Model model) {
        ModelAndView modelAndView = new ModelAndView("index");
        model.addAttribute("email", new Email());
        return modelAndView;
    }

    @PostMapping("/save")
    public String updateSetting(@ModelAttribute("email") Email email, Model model) {

        model.addAttribute("language", email.getLanguage());
        model.addAttribute("pageSize", email.getPageSize());
        if (email.getSpamFilter()) {
            model.addAttribute("spamFilter", "yes");
        } else model.addAttribute("spamFilter", "no");
        if(email.getSignature()==null||email.getSignature()==" "){
            model.addAttribute("signature", "No information");
        }
        model.addAttribute("signature", email.getSignature());
        return "result";

    }

}
