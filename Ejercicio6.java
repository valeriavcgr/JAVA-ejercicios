
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese numero de hombres");
        int hombres = scanner.nextInt();
        System.out.print("ingrese numero de mujeres");
        int mujeres = scanner.nextInt();
        int total = hombres + mujeres;
        double porhom = (double) hombres / total * 100;
        double porMujeres = (double) mujeres / total * 100;
        System.out.println("el porcentaje de hombres es " + porhom + "%");
        System.out.println("el porcentaje de mujeres es " + porMujeres + "%");
        scanner.close();
    }
}
