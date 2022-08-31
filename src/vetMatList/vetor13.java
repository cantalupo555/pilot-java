package vetMatList;

import vetMatList.entities.Rooms;

import java.util.Scanner;

public class vetor13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rooms[] vect = new Rooms[10];
        System.out.print("How many rooms will be rented? ");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] = new Rooms(name, email);
            System.out.println();
        }

        for (int i=0; i<vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
