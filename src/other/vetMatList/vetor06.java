package other.vetMatList;

import java.util.Scanner;

public class vetor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vetA = new int[N];
        int[] vetB = new int[N];
        int[] vetC = new int[N];

        for (int i=0; i<N; i++) {
            vetA[i] = sc.nextInt();
        }

        for (int i=0; i<N; i++) {
            vetB[i] = sc.nextInt();
        }

        for (int i=0; i<N; i++) {
            vetC[i] = vetA[i] + vetB[i];
            System.out.print(vetC[i] + " ");
        }

        sc.close();
    }
}
