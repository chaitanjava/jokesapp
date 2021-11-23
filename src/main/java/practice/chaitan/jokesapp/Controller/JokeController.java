package practice.chaitan.jokesapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import practice.chaitan.jokesapp.Service.JokeService;

@Controller
public class JokeController{

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("jokes",jokeService.getJokes());

        return "index";
    }


}
