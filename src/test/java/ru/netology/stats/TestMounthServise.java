package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMounthServise {
    StatsService statsService =new StatsService();
    int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
            public void summMounthTest(){

    int expected = 180;
    int actual = statsService.summMounth(month);
    Assertions.assertEquals(expected,actual);
    }

    @Test
    public void averageAmountTest(){

        int expected = 15;
        int actual = statsService.averageAmount(month);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void numberBigSaleTest(){

        int expected = 6;
        int actual = statsService.numberBigSale(month);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void numberMinSaleTest(){

        int expected = 9;
        int actual = statsService.numberMinSale(month);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void summMountMinMiddleSaleTest(){

        int expected = 5;
        int actual = statsService.summMountMinMiddleSale(month);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void summMountBigMiddleSale(){

        int expected = 5;
        int actual = statsService.summMountBigMiddleSale(month);
        Assertions.assertEquals(expected,actual);
    }

}
