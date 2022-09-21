package other.vetMatList;

import java.util.Locale;
import java.util.Scanner;

public class vetor03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] vetN = new String[N];
        int[] vetI = new int[N];
        double[] vetA = new double[N];

        for (int i=0; i<N; i++) {
            vetN[i] = sc.next();
            vetI[i] = sc.nextInt();
            vetA[i] = sc.nextDouble();
        }

        double somaA = 0;
        for (double a : vetA) {
            somaA = somaA + a;
        }
        double alturaM = somaA / N;
        System.out.printf("%.2f%n", alturaM);

        int menorI = 0;
        for (int i : vetI) {
            if (i < 16) {
                menorI = menorI + 1;
            }
        }
        double menorP = (double) menorI * 100.0 / N;
        System.out.printf("%.1f%%%n", menorP);

        sc.close();
    }
}
