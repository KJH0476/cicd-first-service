package com.example.FirstService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FirstService {

    public String getGreeting() {
        return "Hello from FirstService!";
    }
}
