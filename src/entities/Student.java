package entities;

public class Student {
    public double nota1;
    public double nota2;
    public double nota3;

    // Validar nota
    public boolean checkNota1() {
        boolean result = true;
        if (nota1 < 0.0 || nota1 > 30.0) {
            result = false;
        }
        return result;
    }

    // Validar nota
    public boolean checkNota2() {
        boolean result = true;
        if (nota2 < 0.0 || nota2 > 35.0) {
            result = false;
        }
        return result;
    }

    // Validar nota
    public boolean checkNota3() {
        boolean result = true;
        if (nota3 < 0.0 || nota3 > 35.0) {
            result = false;
        }
        return result;
    }

    public double mediaFinal(){
        return nota1 + nota2 + nota3;
    }

    public double missingPoints() {
        return 60.0 - mediaFinal();
    }
}
