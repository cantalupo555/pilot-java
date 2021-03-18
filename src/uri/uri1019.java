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

// https://www.urionlinejudge.com.br/judge/problems/view/1019