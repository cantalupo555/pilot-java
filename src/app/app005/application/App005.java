package app.app005.application;

import app.app005.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class App005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        // Validar e inserir notas
        student.nota1 = sc.nextDouble();
        while (!student.checkNota1()) {
            System.out.println("Nota 01 invalida.");
            student.nota1 = sc.nextDouble();
        }

        // Validar e inserir notas
        student.nota2 = sc.nextDouble();
        while (!student.checkNota2()) {
            System.out.println("Nota 02 invalida.");
            student.nota2 = sc.nextDouble();
        }

        // Validar e inserir notas
        student.nota3 = sc.nextDouble();
        while (!student.checkNota3()) {
            System.out.println("Nota 03 invalida.");
            student.nota3 = sc.nextDouble();
        }

        System.out.printf("%nFINAL GRADE = %.2f%n", student.mediaFinal());
        if (student.mediaFinal() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
