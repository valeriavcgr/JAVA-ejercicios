package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    private double metros;
    public void setMetros(double metrosen) {
        this.metros = metrosen;
    }
    public double getPulgadas() {
        return metros * 39.27;
    }
    public double getPies() {
        return getPulgadas() / 12;
    }
    public void convertir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en metros ");
        double metrosingresados = scanner.nextDouble();
        scanner.close();
        setMetros(metrosingresados);
        System.out.println("Equivale a " + getPulgadas() + " pulgadas.");
        System.out.println("Equivale a " + getPies() + " pies.");
    }
}



