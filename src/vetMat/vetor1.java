package vetMat;

import java.util.Scanner;

public class vetor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextInt();
        }

        for (int vetI : vet) {
            if (vetI < 0) {
                System.out.println(vetI);
            }
        }

        sc.close();
    }
}
