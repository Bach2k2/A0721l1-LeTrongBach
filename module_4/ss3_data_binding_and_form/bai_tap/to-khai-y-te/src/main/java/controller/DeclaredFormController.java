package controller;

import model.DeclaredForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medical-declaration")
public class DeclaredFormController {
    @GetMapping("")
    public String index(Model model)
    {
        model.addAttribute("declaredForm",new DeclaredForm());
        return "index";
    }
    @PostMapping("/declare")
    public String declare(@ModelAttribute("declaredForm") DeclaredForm declaredForm)
    {
        return "success";
    }
}
