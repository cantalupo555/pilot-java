package vetMat;

import java.util.Locale;
import java.util.Scanner;

public class vetor7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextDouble();
        }

        double soma = 0;
        for (double vetS : vet) {
            soma += vetS;
        }
        double media = soma / N;
        System.out.printf("%.3f%n", media);

        for (double vetM : vet) {
            if (vetM < media) {
                System.out.printf("%.1f%n", vetM);
            }
        }

        sc.close();
    }
}
