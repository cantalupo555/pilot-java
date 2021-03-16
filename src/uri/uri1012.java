package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        //Área do triângulo
        double aTriangulo = A * C / 2;

        //Área do círculo
        double aCirculo = 3.14159 * (Math.pow(C, 2));

        //Áre do trápezio
        double aTrapezio = (A + B) * C / 2;

        //Área do quadrado
        double aQuadrado = B * B;

        //Área do retângulo
        double aRetangulo = A * B;

        sc.close();

        System.out.printf("TRIANGULO: %.3f%n", aTriangulo);
        System.out.printf("CIRCULO: %.3f%n", aCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", aTrapezio);
        System.out.printf("QUADRADO: %.3f%n", aQuadrado);
        System.out.printf("RETANGULO: %.3f%n", aRetangulo);
    }
}

// https://www.urionlinejudge.com.br/judge/problems/view/1012