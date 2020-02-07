package com.alevel.java.nix.teslastocks;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TeslaStocksTest {

    private TeslaStocks teslaStocks;
    private BestProfit initialbestProfit;
    @BeforeEach
    void setup()
    {
        teslaStocks = new TeslaStocks();
        initialbestProfit = new BestProfit();
        initialbestProfit.sellday = 4;
        initialbestProfit.buyday = 2;
    }
    @Test
    void teslaStocks() {
            test();
    }
    void test() {
        BestProfit resultBestProfit = teslaStocks.teslaStocks(715.0, 680.4, 653.3, 723.4, 743.7);
        assertEquals(resultBestProfit.buyday, initialbestProfit.buyday);
        assertEquals(resultBestProfit.sellday, initialbestProfit.sellday);
    }
}