package com.alevel.java.nix.teslastocks;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Arrays;

public class TeslaStocks {
    public BestProfit teslaStocks(double... stocks) {
        double benefit = 0;
        double buyedStock = 0;
        double soldStock = 0;
        int dayBuy = 0, daySell = 0;

        for (int i = stocks.length - 1; i >= 0; i--) {
            if(stocks[i]<0)
            {
                throw new IllegalArgumentException("");
            }
            if (soldStock < stocks[i]) {
                soldStock = stocks[i];
                daySell = i;
            }
        }
        if (soldStock != stocks[0])
        {
            for (int i = 0; i < daySell; i++)
            {
                if (soldStock - stocks[i] > benefit)
                {
                    benefit = (soldStock - stocks[i]);
                    buyedStock = stocks[i];
                    dayBuy = i;
                }
            }
        }
        BestProfit bestProfit = new BestProfit();
        bestProfit.buyday = dayBuy;
        bestProfit.sellday = daySell;
        return bestProfit;
    }
}
