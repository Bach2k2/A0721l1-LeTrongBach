package controller;

import model.MusicApp;
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
@RequestMapping("/musicApp")
public class MusicAppController {
    @Autowired
    private MusicAppService musicAppService=new HibernateMusicAppServiceImpl();

    @GetMapping
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("musics/list");
        List<MusicApp> musicApps = musicAppService.findAll();
        modelAndView.addObject("musics", musicApps);
        return modelAndView;
    }

    @GetMapping("{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("musics/info");
        MusicApp musicApp = musicAppService.findOne(id);
        modelAndView.addObject("music",musicApp);
        return modelAndView;
    }

    @PostMapping
    public String updateCustomer(MusicApp musicApp) {
        musicAppService.save(musicApp);
        return "redirect:/musicApp";
    }
}
