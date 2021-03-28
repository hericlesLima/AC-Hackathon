package org.academiadecodigo.endemic_species.controller;

import org.academiadecodigo.endemic_species.persistence.model.Doner;
import org.academiadecodigo.endemic_species.persistence.model.User;
import org.academiadecodigo.endemic_species.services.DonerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/donor")
public class DonorController {

    private DonerImpl donerImpl;

    @Autowired
    public void setDonerImpl(DonerImpl donerImpl) {
        this.donerImpl = donerImpl;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String login(Model model) {

        model.addAttribute("user", new Doner());

        return "user/login";
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public String check(@ModelAttribute("user") Doner doner, Model model) {

        Doner donerSaved = donerImpl.save(doner);

        model.addAttribute("user", donerSaved);

        return "user/show";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/register")
    public String register(Model model) {

        model.addAttribute("user", new Doner());

        return "user/register";
    }
}
