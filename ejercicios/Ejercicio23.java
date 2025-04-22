//package ejercicios;
//import java.util.Scanner;

//public class Ejercicio23{
//    public static void main(String[] args) {
   //     Scanner scanner = new Scanner(System.in);
  //      System.out.print("escriba los kilogramos de harina  ");
    //    double m = scanner.nextDouble();
  //      System.out.print("escriba los kilos de aceite ");
   //     double n = scanner.nextDouble();
   //     System.out.print("Precio bulto de harina  ");
   //     double b1 = scanner.nextDouble();
   //     System.out.print("Precio caja de aceite ");
   //     double b2 = scanner.nextDouble();
   //     System.out.print("Precio por kilogramo de harina  ");
   //     double b3 = scanner.nextDouble();
    //    System.out.print("Precio por litro de aceite ");
   //     double b4 = scanner.nextDouble();

   //     int bultoh = (int) (m / 24);
   //     double kilosHarinaDetal = m % 24;
  //      int cajaceite = (int) (n / 15);
  //      double litrosAceiteDetal = n % 15;

    //    double ingresoHarinaBultos = bultoh * b1;
    //    double ingresoHarinaDetal = kilosHarinaDetal * b3;
   //     double ingresoAceiteCajas = cajaceite * b2;
    ////    double ingresoAceiteDetal = litrosAceiteDetal * b4;

    //    double ingresoTotal = ingresoHarinaBultos + ingresoHarinaDetal + ingresoAceiteCajas + ingresoAceiteDetal;

   //     System.out.println("Ingreso total: " + ingresoTotal);
 //       scanner.close();
 //   }
// }
package ejercicios;
import java.util.Scanner;

public class Ejercicio23 {
  
    private double kgHarina, kgAceite, precioBultoHarina, precioCajaAceite, precioKiloHarina, precioLitroAceite;


    public void setDatos(double m, double n, double b1, double b2, double b3, double b4) {
        this.kgHarina = m;
        this.kgAceite = n;
        this.precioBultoHarina = b1;
        this.precioCajaAceite = b2;
        this.precioKiloHarina = b3;
        this.precioLitroAceite = b4;
    }

    public double getIngresoTotal() {
        int bultosHarina = (int)(kgHarina / 24);
        double harinaDetal = kgHarina % 24;
        int cajasAceite = (int)(kgAceite / 15);
        double aceiteDetal = kgAceite % 15;

        double ingresoHarinaBultos = bultosHarina * precioBultoHarina;
        double ingresoHarinaDetal = harinaDetal * precioKiloHarina;
        double ingresoAceiteCajas = cajasAceite * precioCajaAceite;
        double ingresoAceiteDetal = aceiteDetal * precioLitroAceite;

        return ingresoHarinaBultos + ingresoHarinaDetal + ingresoAceiteCajas + ingresoAceiteDetal;
    }
    public void ingreso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilogramos de harina ");
        double m = scanner.nextDouble();
        System.out.print("Kilogramos de aceite ");
        double n = scanner.nextDouble();
        System.out.print("Precio bulto de harina ");
        double b1 = scanner.nextDouble();
        System.out.print("Precio caja de aceite");
        double b2 = scanner.nextDouble();
        System.out.print("Precio por kilogramo de harina ");
        double b3 = scanner.nextDouble();
        System.out.print("Precio por litro de aceite ");
        double b4 = scanner.nextDouble();
        scanner.close();

        setDatos(m, n, b1, b2, b3, b4);

        System.out.println("Ingreso total " + getIngresoTotal());
    }
}

