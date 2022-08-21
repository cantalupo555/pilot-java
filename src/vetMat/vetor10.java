package vetMat;

import java.util.Locale;
import java.util.Scanner;

public class vetor10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] vetNome = new String[N];
        double[] vetNota1 = new double[N];
        double[] vetNota2 = new double[N];
        double[] vetMedia = new double[N];

        for (int i=0; i<N; i++) {
            vetNome[i] = sc.next();
            vetNota1[i] = sc.nextDouble();
            vetNota2[i] = sc.nextDouble();
        }

        for (int i=0; i<N; i++) {
            vetMedia[i] = (vetNota1[i] + vetNota2[i]) / 2;
        }

        System.out.println("Alunos aprovados:");
        for (int i=0; i<N; i++) {
            if (vetMedia[i] >= 6.0) {
                System.out.println(vetNome[i]);
            }
        }

        sc.close();
    }
}
