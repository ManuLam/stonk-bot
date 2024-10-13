package com.example.stonk_bot.service;

import com.example.stonk_bot.client.AlphaVantageClient;
import com.example.stonk_bot.model.stocks.GlobalQuote;
import com.example.stonk_bot.model.stocks.StockInfo;
import com.example.stonk_bot.model.stocks.StockQuery;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StockNewsService {

    public static final String API_KEY = "Y8N4E22TW25PRYHS";

    @Autowired
    AlphaVantageClient alphaVantageClient;

    public StockInfo getNewsData(StockQuery stockQuery) {
        return alphaVantageClient.companyOverview(stockQuery.function(), stockQuery.symbol(), stockQuery.apikey());
    }

    public GlobalQuote getStockValue(StockQuery stockQuery) {
        return alphaVantageClient.globalQuote("GLOBAL_QUOTE", stockQuery.symbol(), stockQuery.apikey());
    }
}
