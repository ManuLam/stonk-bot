package com.example.stonk_bot.client;

import com.example.stonk_bot.model.stocks.GlobalQuote;
import com.example.stonk_bot.model.stocks.StockInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="alpha-vantage-client", url="https://www.alphavantage.co/query")
public interface AlphaVantageClient {

    @GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    StockInfo companyOverview(@RequestParam("function") String function,
                       @RequestParam("symbol") String symbol,
                       @RequestParam("apikey") String apikey);

    @GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    GlobalQuote globalQuote(@RequestParam("function") String function,
                                @RequestParam("symbol") String symbol,
                                @RequestParam("apikey") String apikey);

}
