//  El cambio de divisas en la bolsa de Madrid el 25/08/1987 fue el siguiente 
//(dólar EEUU = 122.499 pesetas 
//100 dracmas griegos = 88.607 pesetas 
//100 francos belgas = 323.728 pesetas 
//1 franco francés = 20.110 pesetas 
//1 libra esterlina = 178.938 pesetas 
//100 liras italianas = 9.289 pesetas 
//Lea una cantidad en chelines austriacos e imprima el equivalente en pesetas. Lea //una  cantidad en dracmas griegos e imprima su equivalente en francos franceses. Finalmente, lea //una  cantidad en pesetas e imprima su equivalente en dólares y liras italianas. 

import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chelines austriacos: ");
        double chelines = scanner.nextDouble();
        double pesetasC = chelines * 956.871 / 100;
        System.out.println("chelies " + pesetasC);
        System.out.print("Dracmas griegos: ");
        double dracmas = scanner.nextDouble();
        double francosFrancesesDracmas = dracmas * 88.607 / 100 / 20.110;
        System.out.println("Francos franceses (dracmas): " + francosFrancesesDracmas);
        System.out.print("Pesetas: ");
        double pesetas = scanner.nextDouble();
        double dolaresPesetas = pesetas / 122.499;
        double lirasItalianasPesetas = pesetas / 9.289 * 100;
        System.out.println("Dólares (pesetas): " + dolaresPesetas);
        System.out.println("Liras italianas (pesetas): " + lirasItalianasPesetas);
        scanner.close();
    }
}
