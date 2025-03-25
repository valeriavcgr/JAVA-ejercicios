import java.util.Scanner;

public class Ejercicio23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("escriba los kilogramos de harina  ");
        double m = scanner.nextDouble();
        System.out.print("escriba los kilos de aceite ");
        double n = scanner.nextDouble();
        System.out.print("Precio bulto de harina  ");
        double b1 = scanner.nextDouble();
        System.out.print("Precio caja de aceite ");
        double b2 = scanner.nextDouble();
        System.out.print("Precio por kilogramo de harina  ");
        double b3 = scanner.nextDouble();
        System.out.print("Precio por litro de aceite ");
        double b4 = scanner.nextDouble();

        int bultoh = (int) (m / 24);
        double kilosHarinaDetal = m % 24;
        int cajaceite = (int) (n / 15);
        double litrosAceiteDetal = n % 15;

        double ingresoHarinaBultos = bultoh * b1;
        double ingresoHarinaDetal = kilosHarinaDetal * b3;
        double ingresoAceiteCajas = cajaceite * b2;
        double ingresoAceiteDetal = litrosAceiteDetal * b4;

        double ingresoTotal = ingresoHarinaBultos + ingresoHarinaDetal + ingresoAceiteCajas + ingresoAceiteDetal;

        System.out.println("Ingreso total: " + ingresoTotal);
        scanner.close();
    }
}
