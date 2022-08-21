package test;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numero 1");
            int number1 = sc.nextInt();
        System.out.println("Digite numero 2");
            int number2 = sc.nextInt();
        System.out.println("Digite numero 3");
            int number3 = sc.nextInt();

            if (number1 < number2 && number1 < number3) {
                System.out.println("\nMenor numero: " + number1);
            }
            else if (number2 < number3) {
                System.out.println("\nMenor numero: " + number2);
            }
            else {
                System.out.println("\nMenor numero: " + number3);
            }

        sc.close();
            // Numero 1 sempre smempre o meio quando uma das condiçoes for atingida, caso N1<N2 (V) && N1<N3 (F) entao Numero 3 sera o menor.
            // Caso N1<N2 (F) && N1<N3 (V) entao o Numero 2 sera o menor.
            // Nesta logica se torna importante o teste N2<N3 caso o Numero 1 for o maior de todos N1<N2 (F) && N1<N3 (F), consequentemente nao sera o numero do meio.
    }
}