package org.madrona.web.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String homePage() {
        return "dash-board";
    }
    /**
     * Rendering login page
     */
    @RequestMapping(value = "/sign-in", method = RequestMethod.GET)
    public String signInPage(ModelMap model) {
        return "login";
    }


}
