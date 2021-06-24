package uri;

import java.util.Scanner;

public class uri1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

            if (number1 % number2 == 0 || number2 % number1 == 0) {
                System.out.println("Sao Multiplos");
            }
            else {
                System.out.println("Nao sao Multiplos");
            }

        sc.close();
    }
}

/*Leia 2 valores inteiros (A e B).
Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.

https://www.urionlinejudge.com.br/judge/problems/view/1044 */