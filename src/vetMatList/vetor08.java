package vetMatList;

import java.util.Locale;
import java.util.Scanner;

public class vetor08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextInt();
        }

        int soma = 0;
        int count = 0;
        for (int vetS : vet) {
            if (vetS % 2 == 0) {
                soma += vetS;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double media = (double) soma / count;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
