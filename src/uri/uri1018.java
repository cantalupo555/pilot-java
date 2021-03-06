package uri;

import java.util.Scanner;

public class uri1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        System.out.println(valor);
        sc.close();
        int c100 = valor / 100;
        int resto100 = valor % 100;
        int c50 = resto100 / 50;
        int resto50 = resto100 % 50;
        int c20 = resto50 / 20;
        int resto20 = resto50 % 20;
        int c10 = resto20 / 10;
        int resto10 = resto20 % 10;
        int c5 = resto10 / 5;
        int resto5 = resto10 % 5;
        int c2 = resto5 / 2;
        int c1 = resto5 % 2;

        System.out.println(c100 + " nota(s) de R$ 100,00");
        System.out.println(c50 + " nota(s) de R$ 50,00");
        System.out.println(c20 + " nota(s) de R$ 20,00");
        System.out.println(c10 + " nota(s) de R$ 10,00");
        System.out.println(c5 + " nota(s) de R$ 5,00");
        System.out.println(c2 + " nota(s) de R$ 2,00");
        System.out.println(c1 + " nota(s) de R$ 1,00");
    }
}

/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

https://www.urionlinejudge.com.br/judge/problems/view/1018 */