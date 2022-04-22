package com.codeup.springblog.controllers;

import model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String postsIndex(Model model){
//                Inside the method that shows all the posts, create a new array list and add two post objects to it, then pass that list to the view.
        ArrayList<Post> allPosts = new ArrayList<>();
        allPosts.add(new Post("Good news - I adopted all of the cats", "Come on down to my house and experience northwest San Antonio's first cat cafe called Howlin' Howell's Cat Cafe - WOW!"));
        allPosts.add(new Post("New special at Howlin' Howell's Cat Cafe!", "We've added a range of new coffee products and TV screens for LAN parties, video game parties, sports events, and otherwise! Call 210-555-5555 to make a reservation today :D"));

        model.addAttribute("allPosts", allPosts);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postView(@PathVariable long id, Model model){

        model.addAttribute("singlePost", new Post("Cats are invading my neighborhood", "Can someone please help me with all of these cats??"));
        return "posts/show";
    }

    @GetMapping("/posts/create/")
    @ResponseBody
    public String postCreate(){

        return "Form for creating a post - pardon our dust!";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String submitPost(){
        return "create a new post";
    }

}