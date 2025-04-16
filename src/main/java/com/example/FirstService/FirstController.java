package com.example.FirstService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/first")
@RequiredArgsConstructor
public class FirstController {

    private final FirstService firstService;

    @GetMapping("/health")
    @ResponseBody
    public String health() {
        return "OK";
    }

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", firstService.getGreeting());
        return "index";
    }
}
