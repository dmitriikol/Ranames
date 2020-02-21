package com.dmitriikol.controller;

import com.dmitriikol.BasicPerson;
import com.dmitriikol.util.BasicPersonBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ranames")
public class IndexController {

    @GetMapping
    public String index(Model model) {
        List<BasicPerson> list = BasicPersonBuilder.createBasicPersons(1);
        model.addAttribute("name", list.get(0).getName());
        model.addAttribute("surname", list.get(0).getSurname());
        model.addAttribute("gender", list.get(0).getGender().toString());
        model.addAttribute("region", list.get(0).getRegion().toString());
        return "index";
    }

    @GetMapping("/info")
    public String info(Model model) {
        return "info";
    }

}
