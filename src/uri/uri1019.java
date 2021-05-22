package uri;

import java.util.Scanner;

public class uri1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        sc.close();
        int hora = tempo / 3600;
        int restoHora = tempo % 3600;
        int minuto = restoHora / 60;
        int segundo = restoHora % 60;

        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
}

/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

https://www.urionlinejudge.com.br/judge/problems/view/1019 */