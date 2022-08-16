package ru.netology.stats;

public class StatsService {


    public int summMounth(int[] mounth) {
        int summ = 0;
        for (int i = 0; i < mounth.length; i++) {
            summ += mounth[i];
        }
        return summ;
    }

    public int averageAmount(int[] mounth) {
        return summMounth(mounth) / mounth.length;
    }

    public int numberBigSale(int[] mounth) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < mounth.length; i++) {
           int  mount = mounth[i];
            if (max < mount) {max = mount;
            index = i;}
        }
        return (index + 1);

    }

    public int numberMinSale(int[] mounth) {
        int min = 1000;
        int index = 0;
        for (int i = 0; i < mounth.length; i++) {
            int  mount = mounth[i];
            if (min > mount) {min = mount;
                index = i;}
        }
        return (index + 1);

    }

    public int summMountMinMiddleSale(int[] mounth) {
        int summ = 0;
        for (int i = 0; i < mounth.length; i++) {
            if (mounth[i] < averageAmount(mounth)) summ = summ + mounth[i];

        }
        return summ;
    }

    public int summMountBigMiddleSale(int[] mounth) {
        int summ = 0;
        for (int i = 0; i < mounth.length; i++) {
            if (mounth[i] > averageAmount(mounth)) summ = summ + mounth[i];

        }
        return summ;
    }


}
