package org.launchcode.find_and_play.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class findController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Hello World";
    }
}
