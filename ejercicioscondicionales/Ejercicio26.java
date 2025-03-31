package ejercicioscondicionales;
//Dados los datos A, B, C y D que representan números enteros; escriba un algoritmo que calcule el
//resultado de las siguientes expresiones:
//Si D=0 (A-C)2
//Si D>0 (A-B )3 /D
import java.util.Scanner;

public class Ejercicio26{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D;
        System.out.print(" escriba A  ");
        A = scanner.nextInt();
        System.out.print("escriba B ");
        B = scanner.nextInt();
        System.out.print("escriba C");
        C = scanner.nextInt();
        System.out.print("escriba D");
        D = scanner.nextInt();
        double resultado;
        if(D==0){
            resultado = Math.pow((A-C), 2);
         } else {
                resultado = Math.pow((A-B), 3) / D;
                }
                System.out.println("El resultado es: " + resultado);
            scanner.close();
        }
    }