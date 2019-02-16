package com.example.demo.controllers;

import com.example.demo.model.FavouritePerson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {

    @RequestMapping("/test")
    public String createForm(Model model) {
        return "createform";
    }
}
