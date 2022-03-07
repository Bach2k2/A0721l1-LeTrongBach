package controller;

import model.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.MusicAppService;
import service.impl.HibernateMusicAppServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/musics")
public class MusicAppController {
    @Autowired
    private MusicAppService musicAppService=new HibernateMusicAppServiceImpl();

    @GetMapping
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("musics/list");
        List<Music> musics = musicAppService.findAll();
        modelAndView.addObject("musics", musics);
        return modelAndView;
    }

    @GetMapping("{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("musics/info");
        Music music = musicAppService.findOne(id);
        modelAndView.addObject("music", music);
        return modelAndView;
    }

    @PostMapping
    public String updateCustomer(Music music) {
        musicAppService.save(music);
        return "redirect:/musics";
    }
}
