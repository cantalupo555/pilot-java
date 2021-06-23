import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numero 1");
            int number1 = sc.nextInt();
        System.out.println("Digite numero 2");
            int number2 = sc.nextInt();
        System.out.println("Digite numero 3");
            int number3 = sc.nextInt();

            if (number1 < number2 && number1 < number3) {
                System.out.println("\nMenor numero: " + number1);
            }
            else if (number2 < number3) {
                System.out.println("\nMenor numero: " + number2);
            }
            else {
                System.out.println("\nMenor numero: " + number3);
            }

        sc.close();
    }
}
