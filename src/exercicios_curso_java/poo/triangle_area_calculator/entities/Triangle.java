package exercicios_curso_java.poo.triangle_area_calculator.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area(){
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}
