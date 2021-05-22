package uri;

import java.util.Scanner;

public class uri1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, r;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        r = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + r);

    }
}

/*Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.

https://www.urionlinejudge.com.br/judge/problems/view/1007 */