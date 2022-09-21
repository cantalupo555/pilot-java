package app.app007.application;

import app.app007.entities.employeeList;

import java.util.*;

public class App007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Total de empregados
        List<employeeList> list = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            System.out.println("\nEmployee #" + (i+1) + ":");

            // Wrapper Classes
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            // Possuí o mesmo ID?
            while (checkId(list, id)) {
                System.out.println("This ID already exists! Try again:");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            // Instaciando e inserindo dados na Lista
            employeeList emp = new employeeList(id, name, salary);
            list.add(emp);
        }

        // Inserir 'id' válido
        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        // Armazenar elemento para 'increaseSalary'
        employeeList empIncrease = list.stream().filter(x  -> x.getId() == id).findFirst().orElse(null);
        if (empIncrease == null) {
            System.out.println("This id does not exist!");
        } else {
            // Aumentar salário
            System.out.print("Enter the percentage: ");
            Double percent = sc.nextDouble();
            empIncrease.increaseSalary(percent);
        }

        // Print List - toString
        System.out.println("\nList of employees:");
        for (employeeList empList : list) {
            System.out.println(empList);
        }

        sc.close();
    }

    // Verificar o 'id'
    public static boolean checkId(List<employeeList> list, int id) {
        return list.stream().anyMatch(x -> x.getId() == id);
    }
}
