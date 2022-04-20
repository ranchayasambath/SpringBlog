package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "posts index page";
    }

    @RequestMapping(path="/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String postsId(@PathVariable int id) {
        return "view an individual post";
    }

    @RequestMapping(path="/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String postsCreateGet() {
        return "view the form for creating a post";
    }
    @PostMapping(path="/posts/create")
    @ResponseBody
    public String postCreatePost(){
        return "create new post";
    }
//    @RequestMapping(path="/posts/create", method = RequestMethod.POST)
//    @ResponseBody
//    public String postsCreatePost(){
//        return "create a new post";
//    }
}
