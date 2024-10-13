package com.example.stonk_bot.controller;

import com.example.stonk_bot.model.UpdateBody;
import com.example.stonk_bot.model.stocks.GlobalQuote;
import com.example.stonk_bot.model.stocks.StockInfo;
import com.example.stonk_bot.model.stocks.StockQuery;
import com.example.stonk_bot.service.DiscordSenderService;
import com.example.stonk_bot.service.StockNewsService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("stock-news")
public class StockNewsController {

    private StockNewsService stockNewsService;
    private DiscordSenderService discordSenderService;

    @GetMapping(path="company-overview", produces=MediaType.APPLICATION_JSON_VALUE)
    StockInfo companyOverview(@RequestBody StockQuery stockQuery) {
        StockInfo newsData = stockNewsService.getNewsData(stockQuery);
        UpdateBody data = UpdateBody.builder().content(newsData.symbol + " " + newsData.description).build();

        discordSenderService.updateDiscordServer(data);
        return newsData;
    }

    @GetMapping(path="stock-value", produces=MediaType.APPLICATION_JSON_VALUE)
    GlobalQuote currentStockVal(@RequestBody StockQuery stockQuery) {
        GlobalQuote newsData = stockNewsService.getStockValue(stockQuery);

        UpdateBody data = UpdateBody.builder().content("Current price of %s: %s".formatted(newsData.symbol,  newsData.price)).build();

        discordSenderService.updateDiscordServer(data);
        return newsData;
    }
}
