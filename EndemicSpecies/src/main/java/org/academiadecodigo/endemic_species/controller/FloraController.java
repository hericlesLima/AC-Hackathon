package org.academiadecodigo.endemic_species.controller;

import org.academiadecodigo.endemic_species.persistence.model.Flora;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/flora")
public class FloraController {

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public String listFlora(Model model) {

        Flora flora1 = new Flora();
        flora1.setId(1);
        flora1.setImageLink("https://live.staticflickr.com/815/40730328274_3a473f3027_b.jpg");
        flora1.setName("Plant One");
        flora1.setDescription("This is something unique at this point");

        Flora flora2 = new Flora();
        flora2.setId(2);
        flora2.setImageLink("https://upload.wikimedia.org/wikipedia/commons/6/6f/Aspidopterys_cordata_W_IMG_2632.jpg");
        flora2.setName("Plant One");
        flora2.setDescription("This is something unique at this point");

        List<Flora> floras = new LinkedList<>();

        floras.add(flora1);
        floras.add(flora2);

        model.addAttribute("floras", floras);

        return "list";
    }

}
