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

/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor.
O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

https://www.urionlinejudge.com.br/judge/problems/view/1012 */