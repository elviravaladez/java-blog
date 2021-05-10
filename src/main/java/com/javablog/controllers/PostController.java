package com.javablog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String getPosts() {
        return "This is the posts page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewIndividualPost(@PathVariable int id) {
        return ("This is post: " + id);
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewCreateForm() {
        return "This is the create form";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "This is where you create a new post";
    }
}
