package uri;

import java.util.Scanner;

public class uri1061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        int calculoD, calculoH, calculoM, calculoS;

        // Inicio
        string = sc.next();
        int d1 = sc.nextInt();
        int h1 = sc.nextInt();
        string = sc.next();
        int m1 = sc.nextInt();
        string = sc.next();
        int s1 = sc.nextInt();

        // Fim
        string = sc.next();
        int d2 = sc.nextInt();
        int h2 = sc.nextInt();
        string = sc.next();
        int m2 = sc.nextInt();
        string = sc.next();
        int s2 = sc.nextInt();

        // Calculo Dia
        if (h1 < h2 || h1 == h2) {
            calculoD = d2 - d1;
        } else {
            // h1 > h2
            calculoD = (d2 - d1) - 1;
        }

        // Calculo Hora
        if (h1 > h2) {
            calculoH = (24 - h1) + h2;

        } else if (h1 == h2) {
            calculoH = 0;
        } else {
            // h1 < h2
            calculoH = h2 - h1;
        }

        // Calculo Minuto
        if (m1 > m2) {
            calculoM = (60 - m1) + m2;
        } else if (m1 == m2) {
            calculoM = 0;
        } else {
            // m1 < m2
            calculoM = m2 - m1;
        }

        // Calculo Segundo
        if (s1 > s2) {
            calculoS = (60 - s1) + s2;
        } else if (s1 == s2) {
            calculoS = 0;
        } else {
            // s1 < s2
            calculoS = s2 - s1;
        }

        System.out.println(calculoD + " dia(s)");
        System.out.println(calculoH + " hora(s)");
        System.out.println(calculoM + " minuto(s)");
        System.out.println(calculoS + " segundo(s)");

        sc.close();
    }
}