package test;

import java.util.Locale;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String vD = "Valor Digitado:";
        String vDP = "Valores Digitados";

        System.out.println("Digite uma string");
        String a;
        a = sc.next();
        System.out.println(vD);
        System.out.println(a);

        System.out.println("\n" + "Digite um inteiro");
        int b;
        b = sc.nextInt();
        System.out.println(vD);
        System.out.println(b);

        System.out.println("\n" + "Digite um double US");
        double c;
        c = sc.nextDouble();
        System.out.println(vD);
        System.out.printf("%.2f%n", c);

    System.out.println("\n" + "Digite um char");
        char d;
        d = sc.next().charAt(0);
        System.out.println(vD);
        System.out.println(d);
        sc.nextLine(); // Quebra linha

        System.out.println("\n" + "Digite três string");
        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println(vDP);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("\n" + "Digite um inteiro e três string");
        int x;
        String s4, s5, s6;
        x = sc.nextInt();
        sc.nextLine(); // Quebra linha
        s4 = sc.nextLine();
        s5 = sc.nextLine();
        s6 = sc.nextLine();
        System.out.println(vDP);
        System.out.println(x);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

        sc.close();
    }
}