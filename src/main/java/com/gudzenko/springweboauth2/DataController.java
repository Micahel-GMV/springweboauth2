package com.gudzenko.springweboauth2;

/**
 * Created by Micahel on 23.06.2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {

    @RequestMapping("/data")
    public String data(@RequestParam(value="name", required=false, defaultValue="UNKNOWN") String name, Model model) {
        model.addAttribute("name", name);
        return "data";
    }

}