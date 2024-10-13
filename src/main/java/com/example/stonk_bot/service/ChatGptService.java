package com.example.stonk_bot.service;

import com.example.stonk_bot.client.ChatGPTClient;
import com.example.stonk_bot.model.chatgpt.ChatGptRequest;
import com.example.stonk_bot.model.chatgpt.Message;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ChatGptService {

    private static final String API_KEY = "Bearer sk-svcacct-LNcMituLXw4kUjG0yI_PYaQMZaEW_x1dwnGB45Vx-_yLG96ZYnLwxAVSZQVdDwwiT3BlbkFJmNqDIjkw1xQUQLigOIA9TPvKVWtZhbAlimgVQWcA6GE0p-PWe7WOLNvv2tJDpZAA";

    @Autowired
    ChatGPTClient feignClient;
    private static final String CHAT_GPT_MODEL = "gpt-3.5-turbo";

    public String postToChatGpt(String userMessage) {
        Message userMessageObj = new Message("user", userMessage);
        return feignClient.getChatGptResponse(API_KEY, new ChatGptRequest(CHAT_GPT_MODEL, List.of(userMessageObj)))
                .getChoices()
                .iterator().next()
                .getMessage().getContent();
    }
}
