package org.academiadecodigo.endemic_species.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller responsible for rendering the initial page of the application
 */
@Controller
@RequestMapping("")
public class MainController {

    /**
     * Renders the home page view
     *
     * @return the view
     */
    @RequestMapping("/")
    public String home() {
        return "redirect:/home";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"", "/home"})
    public String welcome() {

        return "welcome";
    }
}
