package ejercicios;
import java.util.Scanner;
public class Ejercicio1 {
    //aqui defino como privadas mis variables
    private int edad1, edad2, edad3;
    // aqui construyo (definimos) el setter(asignar valores) para modificar los valores de mis  variables guardadas
    public void setPromedio(int primeraedad, int segundaedad, int terceraedad){
        this.edad1 = primeraedad;
        this.edad2 = segundaedad;
        this.edad3 = terceraedad;
    };
    // aqui construyo el getter para obtener los valores y calcular el promedio com mis variables privadas, el getter es un metodo 
    public float getPromedio(){

        return (edad1+edad2+edad3)/3;
    };
    // aqui  primero capturo los datos y los asigno a una variable diferente al nombre de mis variables privadas 
    //  y ejecuto la logica del algoritmo osea usar el main

    public void promedio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("escriba la primera edad");
         int primeraedad1 = scanner.nextInt();
        System.out.print("escriba la segunda edad ");
        int segundaedad2 = scanner.nextInt();
        System.out.print("escriba la tercera edad ");
        int terceraedad3 = scanner.nextInt();
        scanner.close();
    
    // aqui asigno los valores atravez del setter
    setPromedio(primeraedad1, segundaedad2, terceraedad3);
    // aqui obtengo el resultado atravez del getter
    System.out.println("el promedio de las tres edades es"+ getPromedio());
    }

}

