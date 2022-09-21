package app.app001.application;

import app.app001.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class App001 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Lados do triangulo
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Informar a area do triangulo
        System.out.printf("Triangle X area: %.4f%n", x.area());
        System.out.printf("Triangle Y area: %.4f%n", y.area());

        // Maior triangulo
        if (x.area() > y.area()) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
