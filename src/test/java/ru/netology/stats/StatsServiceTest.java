package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService serviceSum = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = serviceSum.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService serviceAverage = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = serviceAverage.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService serviceMaxMonth = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMonth = 8;
        long actualMaxMonth = serviceMaxMonth.maxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinSaleMonth() {
        StatsService serviceMinMonth = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = serviceMinMonth.minMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldMonthsBelowAverage() {
        StatsService serviceBelowAverage = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverage = 5;
        int actualBelowAverage = serviceBelowAverage.monthsBelowAverage(sales);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void shouldMonthsAboveAverage() {
        StatsService serviceAboveAverage = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverage = 5;
        int actualAboveAverage = serviceAboveAverage.monthsAboveAverage(sales);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}
