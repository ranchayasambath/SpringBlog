package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class MathController {
    @RequestMapping(path="/{math}/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable String math, @PathVariable int num1, @PathVariable int num2) {
        if(math.equals("add")) {
            return Integer.toString(num1+num2);
        }
        return math;
    }
    @RequestMapping(path = "/{math}/{num2}/from/{num1}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable String math,@PathVariable int num1, @PathVariable int num2) {
        if(math.equals("subtract")) {
            return Integer.toString(num1-num2);
        }
        return math;
    }
    @RequestMapping(path = "/multiply/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int multiply(@PathVariable int num1, @PathVariable int num2) {
     return num1 * num2;
    }
    @RequestMapping(path = "/{math}/{num1}/by/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable String math,@PathVariable int num1, @PathVariable int num2) {
        if(math.equals("divide")) {
            return Integer.toString(num1/num2);
        }
        return math;
    }

}
