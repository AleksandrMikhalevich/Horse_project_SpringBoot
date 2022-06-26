package by.it_academy.horse_project_springboot.controller;

import by.it_academy.horse_project_springboot.entity.Horse;
import by.it_academy.horse_project_springboot.service.HorseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Alex Mikhalevich
 * @created 26.06.2022 16:45
 **/
@Controller
@RequiredArgsConstructor
public class HorseController {

    private final HorseService horseService;

    @GetMapping("/new")
    public String showNewForm(Horse horse) {
        return "add-horse";
    }

    @PostMapping("/add_horse")
    public String addHorse(Horse horse) {
        horseService.addHorse(horse);
        return "redirect:/index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        Horse horse = horseService.findHorseById(id);
        model.addAttribute("horse", horse);
        return "update-horse";
    }

    @PostMapping("/update/{id}")
    public String updateHorse(Horse horse) {
        horseService.updateHorse(horse);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteHorse(@PathVariable("id") int id) {
        horseService.deleteHorse(id);
        return "redirect:/index";
    }
    @GetMapping("/index")
    public String showAllHorses(Model model) {
        model.addAttribute("horses", horseService.getAllHorses());
        return "index";
    }

    @GetMapping("/")
    public String showDBHorses(Model model) {
        model.addAttribute("horses", horseService.getAllHorses());
        return "index";
    }
}
