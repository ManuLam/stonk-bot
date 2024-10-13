package com.example.stonk_bot.controller;

import com.example.stonk_bot.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class EventController {

    private final EventService eventService;

    @GetMapping("hello")
    public String hello() {
        return eventService.getHelloWorld();
    }

    @GetMapping("bye")
    public String bye() {
        return eventService.getByeWorld();
    }
}
