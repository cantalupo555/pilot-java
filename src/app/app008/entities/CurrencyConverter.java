package app.app008.entities;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double dollarToReal(double priceDollar, double amountDollar) {
        return (priceDollar * amountDollar * IOF) + (priceDollar * amountDollar);
    }
}
