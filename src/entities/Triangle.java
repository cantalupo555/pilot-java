package entities;

public class Triangle {
    // Atributos do triangulo
    public double a;
    public double b;
    public double c;

    // Metodo, calculando area do triangulo
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
