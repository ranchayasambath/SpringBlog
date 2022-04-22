package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {


    @GetMapping("/roll-dice")
    public String diceStart(){
        return "rollDiceView";
    }

    @GetMapping("/roll-dice/{n}")
    public String diceRolled(@PathVariable int n, Model model){

        //Things we need: randomNum and test of randomNum vs pathVar:number; command flow for t/f was user guess correct? Command flow will change the message appropriately
        int randomNum = (int)Math.floor(Math.random()*(6-1+1)+1);

        String message = "";

        if(randomNum == n){
            message = "You got lucky this time punk. >:( You guessed correctly!";
        } else {
            message = "Now the pain begins - you got it wrong. >:D";
        }

        System.out.println("What did we get? Randomnum = " + randomNum + "; userNumber = " + n);

        System.out.println("message = " + message);

        model.addAttribute("number", n);
        model.addAttribute("message", message);
        model.addAttribute("randomNum", randomNum);
        return "rollDiceView";
    }

}