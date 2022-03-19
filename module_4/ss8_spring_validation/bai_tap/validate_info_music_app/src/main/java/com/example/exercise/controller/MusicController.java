package com.example.exercise.controller;

import com.example.exercise.model.Music;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicController {

    @GetMapping()
    public String showMusicSearch(Model model)
    {
        model.addAttribute("music",new Music());
        return "search-music";
    }

    @PostMapping("/search")
    public ModelAndView searchMusic(@ModelAttribute Music music)
    {
        ModelAndView model=new ModelAndView("result");
        model.addObject("music",music);
        return model;
    }
}
