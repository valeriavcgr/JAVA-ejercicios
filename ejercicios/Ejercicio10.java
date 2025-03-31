package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    private double chelines, dracmas, pesetas;
    public void setCantidades(double chelinesm, double dracmasm, double pesetasm) {
        this.chelines = chelinesm;
        this.dracmas = dracmasm;
        this.pesetas = pesetasm;
    }
    public double getPesetas() {
        return (chelines * 956.871) / 100;
    }
    public double getFrancos() {
        return (dracmas * 88.607) / 100 / 20.110;
    }
    public double getDolares() {
        return pesetas / 122.499;
    }
    public double getLiras() {
        return (pesetas * 100) / 9.289;
    }
    public void moneda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en chelines austríacos ");
        double chelinesIngresados = scanner.nextDouble();
        System.out.print("Ingrese la cantidad en dracmas griegos ");
        double dracmasIngresados = scanner.nextDouble();
        System.out.print("Ingrese la cantidad en pesetas ");
        double pesetasIngresadas = scanner.nextDouble();
        scanner.close();
        setCantidades(chelinesIngresados, dracmasIngresados, pesetasIngresadas);
        System.out.println("El equivalente en pesetas es  " + getPesetas());
        System.out.println("El equivalente en francos franceses es  " + getFrancos());
        System.out.println("El equivalente en dólares es  " + getDolares());
        System.out.println("El equivalente en liras italianas es  " + getLiras());
    }
}

