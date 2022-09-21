package other.vetMatList;

import java.util.Locale;
import java.util.Scanner;

public class vetor02 {
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
            soma = soma + vetS;
        }
        System.out.printf("%.2f%n", soma);

        double media = soma / N;
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}
