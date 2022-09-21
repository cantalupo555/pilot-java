package app.app004.application;

import app.app004.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class App004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        // Informacao do empregado
        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        // Print toString
        System.out.println("\nEmployee: " + emp);

        System.out.print("\nWhich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("\nUpdated data: " + emp);

        sc.close();
    }
}
