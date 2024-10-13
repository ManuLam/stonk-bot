package com.example.stonk_bot.model.chatgpt;

import java.util.List;

public class ChatGptResponse {
    private String id;
    private String object;
    private List<Choice> choices;

    public String getId() {
        return id;
    }

    public String getObject() {
        return object;
    }

    public List<Choice> getChoices() {
        return choices;
    }
}
