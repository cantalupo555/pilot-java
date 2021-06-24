package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int itemE = sc.nextInt();
        int quantidade = sc.nextInt();

            if (itemE == 1) {
                double item1 = 4.0;
                double saldoD = (double) quantidade * item1;
                System.out.printf("Total: R$ %.2f%n", saldoD);
            } else if (itemE == 2) {
                double item2 = 4.5;
                double saldoD = (double) quantidade * item2;
                System.out.printf("Total: R$ %.2f%n", saldoD);
            } else if (itemE == 3) {
                double item3 = 5.0;
                double saldoD = (double) quantidade * item3;
                System.out.printf("Total: R$ %.2f%n", saldoD);
            } else if (itemE == 4) {
                double item4 = 2.0;
                double saldoD = (double) quantidade * item4;
                System.out.printf("Total: R$ %.2f%n", saldoD);
            } else {
                double item5 = 1.5;
                double saldoD = (double) quantidade * item5;
                System.out.printf("Total: R$ %.2f%n", saldoD);
            }

        sc.close();
    }
}

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.

https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1038_pt.png

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

https://www.urionlinejudge.com.br/judge/problems/view/1038 */