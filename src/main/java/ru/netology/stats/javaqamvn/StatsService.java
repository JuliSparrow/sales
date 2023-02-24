package ru.netology.stats.javaqamvn;

public class StatsService {

    public int totalSales(int[] sales) {
        int summ = 0;
        for (int s : sales) {
            summ = summ + s;
        }
        return summ;
    }

    public int averageMonth(int[] sales) {
        return totalSales(sales)/sales.length;
    }

    public int maxSalesMonthNumber(int[] sales) {
        int number = 0;
        int maxSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                maxSales = sales[i];
                number = i;
            }
        }
        return number+1;
    }

    public int minSalesMonthNumber(int[] sales) {
        int number = 0;
        int minSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                minSales = sales[i];
                number = i;
            }
        }
        return number+1;
    }

    public int monthWithMinSales(int[] sales) {
        int count = 0;
        int average = averageMonth(sales);
        for (int i : sales) {
            if (i < average) {
                count++;
            }
        }
        return count;
    }

    public int monthWithMaxSales(int[] sales) {
        int count = 0;
        int average = averageMonth(sales);
        for (int i : sales) {
            if (i > average) {
                count++;
            }
        }
        return count;
    }
}
