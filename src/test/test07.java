package test;

import java.util.Locale;
import java.util.Scanner;

public class test07 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double l, c, vm, a, v;

        System.out.println("Qual a largura do terreno?");
        l = sc.nextDouble();
        System.out.println("QUal o comprimento do terreno?");
        c = sc.nextDouble();
        System.out.println("Qual o valor do m²?");
        vm = sc.nextDouble();

        a  = l * c;
        v = a * vm;

        System.out.printf("\nÁrea do terreno: %.2f%n", a);
        System.out.printf("Valor do terreno: %.2f%n", v);
        sc.close();

    }
}
