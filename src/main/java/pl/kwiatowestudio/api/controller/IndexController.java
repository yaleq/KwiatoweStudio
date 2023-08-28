package pl.kwiatowestudio.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@AllArgsConstructor
public class IndexController {
    private static final String INDEX = "/";

    @RequestMapping(value = INDEX, method = RequestMethod.GET)
    public String homePage() {
        return "index";
    }
}
