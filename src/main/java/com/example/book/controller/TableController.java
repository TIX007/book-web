package com.example.book.controller;

import com.example.book.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){
        List<User> users = Arrays.asList(new User("zhangsan","123"),
                new User("lisi","123456"),
                new User("wangwu","abc123"),
                new User("zhaoliu","456789"));
        model.addAttribute("users",users);
        return "table/dynamic_table";
    }
}
