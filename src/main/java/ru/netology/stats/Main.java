package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService statsService = new StatsService();

        System.out.println(statsService.summMounth(month));
        System.out.println(statsService.averageAmount(month));
        System.out.println(statsService.numberBigSale(month));
        System.out.println(statsService.numberMinSale(month));
        System.out.println(statsService.summMountMinMiddleSale(month));
        System.out.println(statsService.summMountBigMiddleSale(month));

    }
}
