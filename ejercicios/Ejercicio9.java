package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    private double trabajo, hora;
    public void setSalario(double horastrabajadas, double precioporhora) {
        this.trabajo = horastrabajadas;
        this.hora = precioporhora;
    }
    public double getSalario() {
        return trabajo * hora;
    }
    public double getSalarioNeto() {
        return getSalario() * 0.80;
    }
    public void salario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de horas trabajadas  ");
        double horasprecio = scanner.nextDouble();
        System.out.print("Ingrese el precio por hora  ");
        double trabaprecio = scanner.nextDouble();
        scanner.close();
        setSalario(horasprecio, trabaprecio);
        System.out.println("El salario bruto es  " + getSalario());
        System.out.println("El salario neto después del 20% de impuestos es  " + getSalarioNeto());
    }
}


