package controller;

import model.DeclaredForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/medical-declaration")
public class DeclaredFormController {
    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("declaredForm", new DeclaredForm());
        return "index";
    }


    @PostMapping("/declare")
    public String declare(@ModelAttribute("declaredForm") DeclaredForm declaredForm, ModelMap model) {
        model.addAttribute("declaredForm",declaredForm);
        return "success";
    }

    @GetMapping("/newform")
    public String home(Model model)
    {
        model.addAttribute("declaredForm",new DeclaredForm());
        return "declare-form";
    }
//        model.addAttribute("transportNameArray",new String[]{"Tàu bay","Tàu thuyền","Ô tô","khác(Ghi rõ)"});
//        model.addAttribute("transportNameValues",new String[]{"tau_bay","tau_thuyen","oto","khac"});

    //    @GetMapping("/declare")
//    public ModelAndView createAForm(Model model)
//    {
//        ModelAndView modelAndView=new ModelAndView("index");
//        modelAndView.addObject("declaredForm",new DeclaredForm());
//        modelAndView.addObject("transportNameArray",new String[]{"Tau bay","Tau thuyen","o to","Khac"});
//        modelAndView.addObject("transportNameValues",new String[]{"Tau_bay","Tau_thuyen","o_to","khac"});
//        return modelAndView;
//    }
}
