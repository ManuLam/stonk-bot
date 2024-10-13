package com.example.stonk_bot.client;

import com.example.stonk_bot.model.chatgpt.ChatGptRequest;
import com.example.stonk_bot.model.chatgpt.ChatGptResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "chatgpt-client", url = "https://api.openai.com/v1/chat/completions")
public interface ChatGPTClient {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    ChatGptResponse getChatGptResponse(@RequestHeader("Authorization") String authorization, @RequestBody ChatGptRequest request);
}
