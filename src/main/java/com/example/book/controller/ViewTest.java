package com.example.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTest {

    @GetMapping("/feng")
    public String feng(Model model){
        model.addAttribute("msg","你好 feng");
        model.addAttribute("link","http://fengling.xyz");
        return "success";
    }
}
