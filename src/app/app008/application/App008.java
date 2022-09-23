package app.app008.application;

import app.app008.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class App008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double priceDollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amountDollar = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(priceDollar, amountDollar));

        sc.close();
    }
}
