package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("")
    public String showHome() {
        return "index";
    }

    @PostMapping("/calculate")
    //first: gia tri so thu nhat, second : gia tri so thu hai, implement lay tu value cua submit.
    public String calculate(@RequestParam double first, @RequestParam double second, @RequestParam String implement, Model model) {
        double result = 0;
        try {
            switch (implement) {
                case "Addition(+)":
                    result = first + second;
                    implement = "Addition";
                    break;
                case "Subtraction(-)":
                    result = first - second;
                    implement = "Subtraction";
                    break;
                case "Multiplication(X)":
                    result = first * second;
                    implement = "Multiplication";
                    break;
                case "Division(/)":
                    result = first / second;
                    implement = "Division";
                    break;
            }
        } catch (Exception ex) {
            model.addAttribute("message","Input is invalid");
            ex.printStackTrace();
        }
        model.addAttribute("implement", implement);
        model.addAttribute("result", result);
        return "index";
    }
}
