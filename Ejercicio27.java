//Un científico desea que un algoritmo le ayude en su trabajo analizándole tres valores que se
//suministran, para determinar si los dos primeros son las medidas de una figura conocida. Para ello,
//calcule el área de cada una de las figuras que se mencionan a continuación y compárela con el
//tercer valor suministrado; si hay coincidencia, imprima un mensaje que indique de qué figura se
//trata. Las figuras a analizar son:4• Triángulo: b*h Valor1 y Valor2 son base y altura 2
//• Círculo: pi * r2 Valor1 y Valor2 son radio y pi
//• Rectángulo: b * h Valor1 y Valor2 son base y altura

import java.util.Scanner;

public class Ejercicio27{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer valor ");
        double valor1 = scanner.nextDouble();
        System.out.print("el segundo  ");
        double valor2 = scanner.nextDouble();
        System.out.print("Ingrese el tercer valor ");
        double valor3 = scanner.nextDouble();
        double areat = (valor1 * valor2) / 2;
        double arear = valor1 * valor2;
        double areac = Math.PI * Math.pow(valor1, 2); 
        if (valor3 == areat) {
            System.out.println("triangulo");
        } else if (valor3 == arear) {
            System.out.println("rectangulo");
        } else if (valor3 == areac) {
            System.out.println("circulo ");
        } else {
            System.out.println("ninguna figura");
        }
        scanner.close();
  }
}