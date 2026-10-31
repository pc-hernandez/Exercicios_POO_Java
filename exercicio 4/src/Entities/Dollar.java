package Entities;

public class Dollar {
    public static double priceDollar;
    public static double howManyDollar;

    public static final double percent = 6.00;

    public static double CurrencyConverter(){
        priceDollar *= howManyDollar;
        return priceDollar += priceDollar * percent / 100;
    }
}
