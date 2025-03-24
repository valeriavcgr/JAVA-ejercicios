import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese los metros ");
        double metros = scanner.nextDouble();
        double pul = metros * 39.27;
        int pies = (int) (pul / 12);
        double pulgadas = pul % 12;
        System.out.println("La conversión a pies es" + pies);
        System.out.println("Pul: " + pulgadas);
        scanner.close();
    }
}


