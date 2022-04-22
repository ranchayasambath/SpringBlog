package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping("/posts")
    public String postsIndex(Model model){
//                Inside the method that shows all the posts, create a new array list and add two post objects to it, then pass that list to the view.
//                ArrayList<Post> allPosts = new ArrayList<>();
//                allPosts.add(new Post("Good news - I adopted all of the cats", "Come on down to my house and experience northwest San Antonio's first cat cafe called Howlin' Howell's Cat Cafe - WOW!"));
//                allPosts.add(new Post("New special at Howlin' Howell's Cat Cafe!", "We've added a range of new coffee products and TV screens for LAN parties, video game parties, sports events, and otherwise! Call 210-555-5555 to make a reservation today :D"));
        //New exercise: Let's move into grabbing our posts from the database instead :)

        ArrayList<Post> allPosts = (ArrayList<Post>) postDao.findAll();

        model.addAttribute("allPosts", allPosts);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postView(@PathVariable long id, Model model){
        //Old exer: hardcoded single post
//                model.addAttribute("singlePost", new Post("Cats are invading my neighborhood", "Can someone please help me with all of these cats??"));
        //Now: Let's consume the id with a postDao method. . perhaps getById?
        Post post = postDao.getById(id);

        model.addAttribute("singlePost", post);

        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String postCreate(Model model){
        model.addAttribute("newPost", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String submitPost(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body){

        System.out.println("Title:" + title + " and the body was: " + body);

        postDao.save(new Post(title, body));

        return "redirect:/posts";
    }

}