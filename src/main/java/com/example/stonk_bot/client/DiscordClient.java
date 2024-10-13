package com.example.stonk_bot.client;


import com.example.stonk_bot.model.UpdateBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="stonk-bot" , url="https://discord.com/api/webhooks/1295020791154348032/aqiMvLuSK1afMZsJ-BeeA9aGCF8Wp9ZWA0JwObuq0UF9Ua1Kse6Dh03exqjl3R4gJbnJ")
public interface DiscordClient {

    @PostMapping(headers = "content-type=application/json") // https://howtodoinjava.com/spring-mvc/controller-getmapping-postmapping/
    String postToDiscord(@RequestBody UpdateBody sendThis);
}
