package com.example.stonk_bot.model;

import lombok.Builder;

import java.util.List;

@Builder
public record UpdateBody(List<String> updates, String server, String content) {
}
