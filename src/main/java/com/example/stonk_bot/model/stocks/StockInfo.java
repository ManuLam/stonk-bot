package com.example.stonk_bot.model.stocks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockInfo {
    @JsonProperty("Symbol")
    public String symbol;

    @JsonProperty("AssetType")
    public String assetType;

    @JsonProperty("Name")
    public String name;

    @JsonProperty("Description")
    public String description;

    @JsonProperty("CIK")
    public String cik;

    @JsonProperty("Exchange")
    public String exchange;

    @JsonProperty("Currency")
    public String currency;

    @JsonProperty("Country")
    public String country;

    @JsonProperty("Sector")
    public String sector;

    @JsonProperty("Industry")
    public String industry;

    @JsonProperty("Address")
    public String address;

    @JsonProperty("OfficialSite")
    public String officialSite;

    @JsonProperty("FiscalYearEnd")
    public String fiscalYearEnd;

    @JsonProperty("LatestQuarter")
    public String latestQuarter;

    @JsonProperty("MarketCapitalization")
    public String marketCapitalization;

    @JsonProperty("EBITDA")
    public String ebitda;

    @JsonProperty("PERatio")
    public String peRatio;

    @JsonProperty("PEGRatio")
    public String pegRatio;

    @JsonProperty("BookValue")
    public String bookValue;

    @JsonProperty("DividendPerShare")
    public String dividendPerShare;

    @JsonProperty("DividendYield")
    public String dividendYield;

    @JsonProperty("EPS")
    public String eps;

    @JsonProperty("RevenuePerShareTTM")
    public String revenuePerShareTTM;

    @JsonProperty("ProfitMargin")
    public String profitMargin;

    @JsonProperty("OperatingMarginTTM")
    public String operatingMarginTTM;

    @JsonProperty("ReturnOnAssetsTTM")
    public String returnOnAssetsTTM;

    @JsonProperty("ReturnOnEquityTTM")
    public String returnOnEquityTTM;

    @JsonProperty("RevenueTTM")
    public String revenueTTM;

    @JsonProperty("GrossProfitTTM")
    public String grossProfitTTM;

    @JsonProperty("DilutedEPSTTM")
    public String dilutedEPSTTM;

    @JsonProperty("QuarterlyEarningsGrowthYOY")
    public String quarterlyEarningsGrowthYOY;

    @JsonProperty("QuarterlyRevenueGrowthYOY")
    public String quarterlyRevenueGrowthYOY;

    @JsonProperty("AnalystTargetPrice")
    public String analystTargetPrice;

    @JsonProperty("AnalystRatingStrongBuy")
    public int analystRatingStrongBuy;

    @JsonProperty("AnalystRatingBuy")
    public int analystRatingBuy;

    @JsonProperty("AnalystRatingHold")
    public int analystRatingHold;

    @JsonProperty("AnalystRatingSell")
    public int analystRatingSell;

    @JsonProperty("AnalystRatingStrongSell")
    public int analystRatingStrongSell;

    @JsonProperty("TrailingPE")
    public String trailingPE;

    @JsonProperty("ForwardPE")
    public String forwardPE;

    @JsonProperty("PriceToSalesRatioTTM")
    public String priceToSalesRatioTTM;

    @JsonProperty("PriceToBookRatio")
    public String priceToBookRatio;

    @JsonProperty("EVToRevenue")
    public String evToRevenue;

    @JsonProperty("EVToEBITDA")
    public String evToEBITDA;

    @JsonProperty("Beta")
    public String beta;

    @JsonProperty("52WeekHigh")
    public String week52High;

    @JsonProperty("52WeekLow")
    public String week52Low;

    @JsonProperty("50DayMovingAverage")
    public String day50MovingAverage;

    @JsonProperty("200DayMovingAverage")
    public String day200MovingAverage;

    @JsonProperty("SharesOutstanding")
    public String sharesOutstanding;

    @JsonProperty("DividendDate")
    public String dividendDate;

    @JsonProperty("ExDividendDate")
    public String exDividendDate;

    @Override
    public String toString() {
        return "StockInfo{" +
                "symbol='" + symbol + '\'' +
                ", assetType='" + assetType + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cik='" + cik + '\'' +
                ", exchange='" + exchange + '\'' +
                ", currency='" + currency + '\'' +
                ", country='" + country + '\'' +
                ", sector='" + sector + '\'' +
                ", industry='" + industry + '\'' +
                ", address='" + address + '\'' +
                ", officialSite='" + officialSite + '\'' +
                ", fiscalYearEnd='" + fiscalYearEnd + '\'' +
                ", latestQuarter='" + latestQuarter + '\'' +
                ", marketCapitalization='" + marketCapitalization + '\'' +
                ", ebitda='" + ebitda + '\'' +
                ", peRatio='" + peRatio + '\'' +
                ", pegRatio='" + pegRatio + '\'' +
                ", bookValue='" + bookValue + '\'' +
                ", dividendPerShare='" + dividendPerShare + '\'' +
                ", dividendYield='" + dividendYield + '\'' +
                ", eps='" + eps + '\'' +
                ", revenuePerShareTTM='" + revenuePerShareTTM + '\'' +
                ", profitMargin='" + profitMargin + '\'' +
                ", operatingMarginTTM='" + operatingMarginTTM + '\'' +
                ", returnOnAssetsTTM='" + returnOnAssetsTTM + '\'' +
                ", returnOnEquityTTM='" + returnOnEquityTTM + '\'' +
                ", revenueTTM='" + revenueTTM + '\'' +
                ", grossProfitTTM='" + grossProfitTTM + '\'' +
                ", dilutedEPSTTM='" + dilutedEPSTTM + '\'' +
                ", quarterlyEarningsGrowthYOY='" + quarterlyEarningsGrowthYOY + '\'' +
                ", quarterlyRevenueGrowthYOY='" + quarterlyRevenueGrowthYOY + '\'' +
                ", analystTargetPrice='" + analystTargetPrice + '\'' +
                ", analystRatingStrongBuy=" + analystRatingStrongBuy +
                ", analystRatingBuy=" + analystRatingBuy +
                ", analystRatingHold=" + analystRatingHold +
                ", analystRatingSell=" + analystRatingSell +
                ", analystRatingStrongSell=" + analystRatingStrongSell +
                ", trailingPE='" + trailingPE + '\'' +
                ", forwardPE='" + forwardPE + '\'' +
                ", priceToSalesRatioTTM='" + priceToSalesRatioTTM + '\'' +
                ", priceToBookRatio='" + priceToBookRatio + '\'' +
                ", evToRevenue='" + evToRevenue + '\'' +
                ", evToEBITDA='" + evToEBITDA + '\'' +
                ", beta='" + beta + '\'' +
                ", week52High='" + week52High + '\'' +
                ", week52Low='" + week52Low + '\'' +
                ", day50MovingAverage='" + day50MovingAverage + '\'' +
                ", day200MovingAverage='" + day200MovingAverage + '\'' +
                ", sharesOutstanding='" + sharesOutstanding + '\'' +
                ", dividendDate='" + dividendDate + '\'' +
                ", exDividendDate='" + exDividendDate + '\'' +
                '}';
    }
}