package uri;

import java.util.Scanner;

public class uri1013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, k, t;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        k = (a + b + Math.abs(a - b)) / 2;

        t = (k + c + Math.abs(k - c)) / 2;

        System.out.println(t + " eh o maior");

        sc.close();
    }
}

/*Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
Utilize a fórmula: (LINK)
Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

https://www.urionlinejudge.com.br/judge/problems/view/1013 */