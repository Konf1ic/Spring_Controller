package com.main.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class CalculatorController {

    @GetMapping("")
    public String Math(){
        return ("/home");
    }

    @GetMapping("/sum")
    public String Math(@RequestParam (name = "number1") int number1,
                       @RequestParam ( name = "number2") int number2,
                       Model model){

        System.out.println(number1);
        System.out.println(number2);

        int result = number1 + number2;
        model.addAttribute("result", result);
        return("/home");
    }
}