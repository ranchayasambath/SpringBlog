package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class MathController {
    @GetMapping("/add")

    @RequestMapping(path = "/add/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public Integer add(@PathVariable int num1, @PathVariable int num2) {
        return num1+num2;
    }
    @RequestMapping(path = "/subtract/{num2}/from/{num1}", method = RequestMethod.GET)
    @ResponseBody
    public Integer minus(@PathVariable int num1, @PathVariable int num2) {
        return num1-num2;
    }
    @RequestMapping(path = "/multiply/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public Integer multiply(@PathVariable int num1, @PathVariable int num2) {
        return num1*num2;
    }
    @RequestMapping(path = "/divide/{num1}/by/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public Integer divide(@PathVariable int num1, @PathVariable int num2) {
        return num1/num2;
    }

}
