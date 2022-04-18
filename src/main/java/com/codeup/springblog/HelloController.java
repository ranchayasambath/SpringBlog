package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello there from the Sirius conhort! We're already loving Spring!";
    }
    @RequestMapping(path= "/hello/{name}/and/{age}", method = RequestMethod.GET)
    @ResponseBody
    public String helloNameAge(@PathVariable String name,@PathVariable int age){

        return "Hey user! Thanks for letting me know your name is " + name + ". You also told me you were " + age + " years old.";
    }

}
