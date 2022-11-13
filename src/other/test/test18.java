package other.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test18 {
    public static void main(String []args) {

        method1();

        System.out.println("End of program");

    }

    private static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }

    private static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        sc.close();
        System.out.println("***METHOD2 END***");
    }
}
