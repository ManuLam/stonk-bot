package com.example.stonk_bot.controller;

import com.example.stonk_bot.model.UpdateBody;
import com.example.stonk_bot.service.ChatGptService;
import com.example.stonk_bot.service.DiscordSenderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("chatgpt")
public class ChatGptController {

    ChatGptService chatGptService;
    DiscordSenderService discordSenderService;

    @PostMapping("ask")
    public String ask(@RequestBody UpdateBody updateBody) {
        return chatGptService.postToChatGpt(updateBody.content());
    }
}
