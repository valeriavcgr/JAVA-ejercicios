import java.util.Scanner;

public class Ejercicio23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilogramos de harina (M): ");
        double m = scanner.nextDouble();
        System.out.print("Litros de aceite (N): ");
        double n = scanner.nextDouble();
        System.out.print("Precio por bulto de harina (B1): ");
        double b1 = scanner.nextDouble();
        System.out.print("Precio por caja de aceite (B2): ");
        double b2 = scanner.nextDouble();
        System.out.print("Precio por kilogramo de harina al detal (B3): ");
        double b3 = scanner.nextDouble();
        System.out.print("Precio por litro de aceite al detal (B4): ");
        double b4 = scanner.nextDouble();

        int bultosHarina = (int) (m / 24);
        double kilosHarinaDetal = m % 24;
        int cajasAceite = (int) (n / 15);
        double litrosAceiteDetal = n % 15;

        double ingresoHarinaBultos = bultosHarina * b1;
        double ingresoHarinaDetal = kilosHarinaDetal * b3;
        double ingresoAceiteCajas = cajasAceite * b2;
        double ingresoAceiteDetal = litrosAceiteDetal * b4;

        double ingresoTotal = ingresoHarinaBultos + ingresoHarinaDetal + ingresoAceiteCajas + ingresoAceiteDetal;

        System.out.println("Ingreso total: " + ingresoTotal);
        scanner.close();
    }
}
