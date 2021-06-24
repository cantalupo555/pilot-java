package uri;

import java.util.Scanner;

public class uri1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int timeS = sc.nextInt();
        int timeE = sc.nextInt();

            // Time = 0
            // TimeS = TimeE
            // TimeS > TimeE
            if (timeS > timeE || timeS == timeE) {
                int duration = (24 - timeS) + timeE;
                System.out.println("O JOGO DUROU " + duration + " HORA(S)");
            }
            // TimeS < TimeE
            else {
                int duration = timeE - timeS;
                System.out.println("O JOGO DUROU " + duration + " HORA(S)");
            }

        sc.close();
    }
}

/*Leia a hora inicial e a hora final de um jogo.
A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.

https://www.urionlinejudge.com.br/judge/problems/view/1046 */