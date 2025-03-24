//12. Calcule y muestre, a un alumno, cuál será su promedio general en las tres materias más difíciles que  cursa y cuál será el promedio que obtendrá en cada una de ellas. Estas materias se evalúan como se  muestra a continuación: 
//Matemática Examen 90% y 10% del promedio de tres tareas.  
//Física Examen 80% y 20% del promedio de dos tareas. 
//Química Examen 85% y 15% del promedio de tres tareas

import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Matematicas
        System.out.print("ingrese valor perteneciente a el examen de matematicas");
        double mat = scanner.nextDouble();
        System.out.print("Ahora al de la tarea 1 ");
        double matta = scanner.nextDouble();
        System.out.print("Tarea dos");
        double matta2 = scanner.nextDouble();
        System.out.print("tarea 3");
        double matta3= scanner.nextDouble();
        double prommatta= (matta + matta2 + matta3) / 3;
        double promat = (mat* 0.9) + (prommatta * 0.1);
        System.out.println(" el promedio de matematicas es " + promat);

        // Fisica
        System.out.print("ingrese valor perteneciente a el examen de fisica");
        double fis= scanner.nextDouble();
        System.out.print("Ahora al de la tarea 1 ");
        double fis1 = scanner.nextDouble();
        System.out.print("Ahora al de la tarea dos ");
        double fis2 = scanner.nextDouble();
        double promfisica = (fis1 +fis2) / 2;
        double promfis = (fis * 0.8) + (promfisica * 0.2);
        System.out.println("El promedio de fisica es " + promfis);

        // Quimica
        System.out.print("ingrese valor perteneciente a el examen de quimica");
        double qui = scanner.nextDouble();
        System.out.print("Ahora al de la tarea 1");
        double qui1 = scanner.nextDouble();
        System.out.print("Ahora al de la tarea dos ");
        double qui2 = scanner.nextDouble();
        System.out.print("Ahora al de la tarea tres");
        double qui3 = scanner.nextDouble();
        double promquimica = (qui1 + qui2+ qui3) / 3;
        double promqui= (qui * 0.85) + (promquimica * 0.15);
        System.out.println("promedio de química " + promqui);

        double promedio= (promat + promfis + promqui) / 3;
        System.out.println("El rpomedio general de las tres es " + promedio);
        scanner.close();
    }
}
