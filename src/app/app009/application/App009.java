package app.app009.application;

import app.app009.entities.Department;
import app.app009.entities.HourContract;
import app.app009.entities.Worker;
import app.app009.entities.enums.WokerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App009 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(name, baseSalary, WokerLevel.valueOf(level), new Department(department));

        System.out.print("How many contracts to this worker? ");
        int N = sc.nextInt();
        for (int i=0; i<N; i++)  {
            System.out.print("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sc.next());
            System.out.print("Value per hour: ");
            double valeuPerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();

            HourContract contract = new HourContract(date, valeuPerHour, hours);
            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String date = sc.next();
        int month = Integer.parseInt(date.substring(0, 2));
        int year = Integer.parseInt(date.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.println("Income for " + date + ": " + String.format("%.2f%n", worker.income(month, year)));

        sc.close();
    }
}
