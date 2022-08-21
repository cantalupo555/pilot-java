package test;

import java.util.Locale;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
            double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
            double nota2 = sc.nextDouble();
            double notaFinal = nota1 + nota2;
        System.out.printf("%nNOTA FINAL = %.2f%n",notaFinal);

            if (notaFinal < 60.00){
                System.out.println("REPROVADO");
            }
            else {
                System.out.println("APROVADO");
            }
        sc.close();
        }
    }