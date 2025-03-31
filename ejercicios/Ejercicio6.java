package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    private int hombres, mujeres;
    public void setEstudiantes(int numhombres, int nummujeres) {
        this.hombres = numhombres;
        this.mujeres = nummujeres;
    }
    public double getHombres() {
        int total = hombres + mujeres;
        return (hombres * 100.0) / total;
    }
    public double getMujeres() {
        int total = hombres + mujeres;
        return (mujeres * 100.0) / total;
    }
    public void salon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de hombres en el grupo  ");
        int hombresregistrados = scanner.nextInt();
        System.out.print("Ingrese la cantidad de mujeres en el grupo  ");
        int mujeresregistradas = scanner.nextInt();
        scanner.close();
        setEstudiantes(hombresregistrados, mujeresregistradas);
        System.out.println("El porcentaje de hombres en el grupo es  " + getHombres() + "%");
        System.out.println("El porcentaje de mujeres en el grupo es  " + getMujeres() + "%");
    }
}
