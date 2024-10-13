package com.example.stonk_bot.service;

import com.example.stonk_bot.client.DiscordClient;
import com.example.stonk_bot.model.UpdateBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscordSenderService {

    @Autowired
    private DiscordClient discordClient;

    public void updateDiscordServer(UpdateBody updateBody) {
        discordClient.postToDiscord(updateBody);
    }
}
