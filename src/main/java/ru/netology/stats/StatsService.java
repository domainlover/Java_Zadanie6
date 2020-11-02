package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverage(long[] purchases) {
        return calculateSum(purchases)/purchases.length;
    }

    public long findMaxMonth(long[] purchases) {
        int monthIndex = 0;
        int monthMax = 0;
        long max = purchases[0];
        for (long purchase : purchases) {
            monthIndex = monthIndex + 1;
            if (max <= purchase) {
                max = purchase;
                monthMax = monthIndex;
            }
       }
        return monthMax;
    }

    public long findMinMonth(long[] purchases) {
        int monthIndex = 0;
        int monthMin = 0;
        long min = purchases[0];
        for (long purchase : purchases) {
            monthIndex = monthIndex + 1;
            if (min >= purchase) {
                min = purchase;
                monthMin = monthIndex;
            }
        }
        return monthMin;
    }

    public long findMonthsBelowAverage(long[] purchases) {
        long amountMonths = 0;
        long average = calculateAverage(purchases);
        for (long purchase : purchases) {
            if (purchase < average) {
                amountMonths = amountMonths + 1;
            }
        }
        return amountMonths;
    }

    public long findMonthsAboveAverage(long[] purchases) {
        long amountMonths = 0;
        long average = calculateAverage(purchases);
        for (long purchase : purchases) {
            if (purchase > average) {
                amountMonths = amountMonths + 1;
            }
        }
        return amountMonths;
    }

}