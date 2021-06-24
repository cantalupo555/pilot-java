package uri;

import java.util.Scanner;

public class uri1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberA = sc.nextInt();
        int numberB = sc.nextInt();
        int numberC = sc.nextInt();
        int numberD = sc.nextInt();

            if (numberB > numberC && numberD > numberA && numberC + numberD > numberA + numberB && numberC > 0 && numberD > 0 && numberA % 2 == 0) {
                System.out.println("Valores aceitos");
            }
            else {
                System.out.println("Valores nao aceitos");
            }

        sc.close();
    }
}

/*Leia 4 valores inteiros A, B, C e D.
A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D,
ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.

 https://www.urionlinejudge.com.br/judge/problems/view/1035 */