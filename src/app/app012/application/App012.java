package app.app012.application;

import app.app012.entities.Employee;
import app.app012.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class App012 {

    public static void main(String []args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char resp = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(resp == 'n') {
                list.add(new Employee(name, hours, valuePerHour));
            }
            else {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
        }

        System.out.println("\nPAYMENTS:");
        for (Employee pay : list) {
            System.out.print(pay.getName() + " - $ " + String.format("%.2f%n", pay.payment()));
        }

        sc.close();
    }
}
