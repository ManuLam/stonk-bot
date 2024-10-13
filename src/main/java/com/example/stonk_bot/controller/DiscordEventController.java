package com.example.stonk_bot.controller;

import com.example.stonk_bot.model.UpdateBody;
import com.example.stonk_bot.service.DiscordSenderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("discord")
public class DiscordEventController {

    DiscordSenderService discordSenderService;

    @PostMapping("updates")
    public ResponseEntity<String> sendUpdate(@RequestBody UpdateBody updateBody) {
        if (updateBody.updates() == null || updateBody.updates().isEmpty()) {
            return ResponseEntity.badRequest().body("Update body is empty");
        }

        // this will be used by clients to update the information on our server.
        discordSenderService.updateDiscordServer(updateBody);

        return ResponseEntity.ok().body("Successfully inserted: %s".formatted(updateBody.updates()));
    }

    @GetMapping("ping")
    public ResponseEntity<String> isServerRunning() {
        return ResponseEntity.ok().body("Server is running");
    }
}
