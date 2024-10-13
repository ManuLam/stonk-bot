package com.example.stonk_bot.model.chatgpt;

import java.util.List;

public class ChatGptRequest {
    private String model;
    private List<Message> messages;

    public ChatGptRequest(String model, List<Message> messages) {
        this.model = model;
        this.messages = messages;
    }

    public String getModel() {
        return model;
    }

    public List<Message> getMessages() {
        return messages;
    }
}
