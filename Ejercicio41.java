import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de hectáreas del bosque: ");
        double hect = scanner.nextDouble();
        double metros = hect * 10000;
        double pino, oyamel, cedro;
        if (metros > 1000000) { 
            pino = 0.70;
            oyamel = 0.20;
            cedro = 0.10;
        } else { 
            pino = 0.50;
            oyamel = 0.30;
            cedro = 0.20;
        }
        double pinos = metros * pino;
        double oyamels = metros * oyamel;
        double cedros = metros * cedro;
        int cantidadPinos = (int) ((pinos / 10) * 8);
        int cantidadOyameles = (int) ((oyamels / 15) * 15);
        int cantidadCedros = (int) ((cedros / 18) * 10);
        System.out.println("\nCantidad de árboles a sembrar");
        System.out.println("Pinos " + cantidadPinos);
        System.out.println("Oyameles: " + cantidadOyameles);
        System.out.println("Cedros: " + cantidadCedros);
        scanner.close();
    }
}
