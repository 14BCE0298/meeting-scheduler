package com.demo.mvc.meetingscheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("getGreeting")
    public String greetingMessage(Map<String, Object> model) {
        model.put("message", "Hi, Attendees");
        return "greeting";
    }
}
