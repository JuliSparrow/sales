package ru.netology.stats.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalcTotalSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedSumm = 180;
        int actual = service.totalSales(sales);

        Assertions.assertEquals(expectedSumm , actual);
    }

    @Test
    public void shouldCalcAverageMonth() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedAv = 15;
        int actual = service.averageMonth(sales);

        Assertions.assertEquals(expectedAv , actual);
    }

    @Test
    public void shouldCalcMaxSalesMonthNumber() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedNumber = 8;
        int actual = service.maxSalesMonthNumber(sales);

        Assertions.assertEquals(expectedNumber , actual);
    }

    @Test
    public void shouldCalcMinSalesMonthNumber() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedNumber = 9;
        int actual = service.minSalesMonthNumber(sales);

        Assertions.assertEquals(expectedNumber , actual);
    }

    @Test
    public void shouldCalcMonthWithMinSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedCount = 5;
        int actual = service.monthWithMinSales(sales);

        Assertions.assertEquals(expectedCount , actual);
    }

    @Test
    public void shouldCalcMonthWithMaxSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedCount = 5;
        int actual = service.monthWithMaxSales(sales);

        Assertions.assertEquals(expectedCount , actual);
    }
}
