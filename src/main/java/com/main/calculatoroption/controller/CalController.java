package com.main.calculatoroption.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class CalController {

    @GetMapping("")
    public ModelAndView showList() {
        return new ModelAndView("/home");
    }

    @PostMapping("/save")
    public String save(@RequestParam("submit") String submit,
                       @RequestParam("number1") double num1,
                       @RequestParam("number2") double num2,
                       Model model) {
        double result = 0;
        switch (submit) {
            case "Add(+)":
                result = num1 + num2;
                break;
            case "Sub(-)":
                result = num1 - num2;
                break;
            case "Mul(x)":
                result = num1 * num2;
                break;
            case "Div(/)":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result", result);
        return "/home";
    }
}