package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    private double parcial1, parcial2, parcial3, examen, trabajo;
    public void setCalificacion(double examen1, double examen2, double examen3, double examenFinal, double trabajoFinal) {
        this.parcial1 = examen1;
        this.parcial2 = examen2;
        this.parcial3 = examen3;
        this.examen = examenFinal;
        this.trabajo = trabajoFinal;
    }
    public double getCalificacion() {
        double promedioexamen = (parcial1 + parcial2 + parcial3) / 3;
        return (promedioexamen * 0.55) + (examen * 0.30) + (trabajo * 0.15);
    }
    public void calificacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calificación del primer parcial: ");
        double examen01 = scanner.nextDouble();
        System.out.print("Ingrese la calificación del segundo parcial: ");
        double examen02 = scanner.nextDouble();
        System.out.print("Ingrese la calificación del tercer parcial: ");
        double examen03 = scanner.nextDouble();
        System.out.print("Ingrese la calificación del examen final: ");
        double examenFinal = scanner.nextDouble();
        System.out.print("Ingrese la calificación del trabajo final: ");
        double trabajoFinal = scanner.nextDouble();
        scanner.close();
        setCalificacion( examen01,  examen02,  examen03, examenFinal,trabajoFinal);
        System.out.println("Su calificación final en computación es: " + getCalificacion());
    }
}

