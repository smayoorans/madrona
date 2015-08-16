package org.madrona.web.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

    /**
     * Rendering login page
     */
    @RequestMapping(value = "/sign-in", method = RequestMethod.GET)
    public String signInPage(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/sign-up", method = RequestMethod.GET)
    public String signUpPage(ModelMap model) {
        return "sign-up";
    }

}
