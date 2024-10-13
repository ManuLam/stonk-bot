package com.example.stonk_bot.model.chatgpt;

public class Choice {
    private String index;
    private Message message;
    private String finish_reason;

    public String getIndex() {
        return index;
    }

    public Message getMessage() {
        return message;
    }

    public String getFinishReason() {
        return finish_reason;
    }
}
