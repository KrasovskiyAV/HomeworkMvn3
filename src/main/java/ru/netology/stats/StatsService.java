package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {

        long sumSales = 0;

        for (long s : sales) {
            sumSales = sumSales + s;
        }
        return sumSales;
    }

    public long averageSales(long[] sales) {

        long averageSales = sumSales(sales) / sales.length;
        return averageSales;
    }

    public int maxMonth(long[] sales) {

        int maxSaleMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSaleMonth]) {
                maxSaleMonth = i;
            }
        }
        return maxSaleMonth + 1;
    }

    public int minMonth(long[] sales) {

        int minSaleMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSaleMonth]) {
                minSaleMonth = i;
            }
        }
        return minSaleMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {

        int monthBelow = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                monthBelow++;
            }
        }
        return monthBelow;
    }

    public int monthsAboveAverage(long[] sales) {

        int monthsAbove = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                monthsAbove++;
            }
        }
        return monthsAbove;
    }
}
