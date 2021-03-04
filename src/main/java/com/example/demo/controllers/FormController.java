package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;


@Controller
public class FormController {

    ArrayList listOfPost = new ArrayList();

    // Showing how to create a form using thymeleaf
    @GetMapping(value = "/form")
    public String renderForm(Model model) {
        return "form.html";
    }

   /* @GetMapping(value = "/newPost")
    @ResponseBody
    public createNewPost((@RequestParam("name") String nameOnUser, (@RequestParam("content") String content, (@RequestParam("date") String date, (@RequestParam("status") boolean status, (@RequestParam("favoriteFood"String favoriteFood)) {


        // This list gets returned as json!
        return;
    }

    @GetMapping(value = "/list")
    public String postList() {

        *--noget med model og att og herefter skal du tjekke week 8.
        return "list.html";
    }*/
}
