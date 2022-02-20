package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @GetMapping("/")
    public String showHomePage()
    {
        return "dictionary";
    }
    @PostMapping("/translate")
    public String translate(@RequestParam String english, Model model)
    {
        String result="";
        String[] englishWords={"book","chair","mouse","milk","sun","run"};
        String[] vietnameWords={"sách","ghế","chuột","sữa","mặt trời","chạy"};
        for (int i=0;i<englishWords.length;i++) {
            if(english.equals(englishWords[i])){
                result=vietnameWords[i];
                break;
            }
        }
        model.addAttribute("result",result);
        return "dictionary";
    }
}
