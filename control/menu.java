package control;
import ejercicios.*;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú ");
            System.out.println("Seleccione un número entre el 1 y el 45 para elegir el ejercicio");
            System.out.println("0 para Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Ejercicio1 promedioedad = new Ejercicio1();
                    promedioedad.promedio();
                    break;
                case 2:
                    Ejercicio2 invercion = new Ejercicio2();
                    invercion.invertir();
                    break;
                    case 3:
                    Ejercicio3 sueldo = new Ejercicio3();
                    sueldo.sueldo();
                    break;
                    case 4:
                    Ejercicio4 compras = new Ejercicio4();
                    compras.compra();
                    case 5:
                    Ejercicio5 promedios = new Ejercicio5();
                    promedios.calificacion();
                    break;
                    case 6:
                    Ejercicio6 homujer = new Ejercicio6();
                    homujer.salon();
                    break;
                    case 7:
                    Ejercicio7 convercion = new Ejercicio7();
                    convercion.convertir();
                    break; 
                    case 8:
                    Ejercicio8 area = new Ejercicio8();
                    area.triangulo();
                    case 9:
                    Ejercicio9 salarios = new Ejercicio9();
                    salarios.salario();
                    case 10:
                    Ejercicio10 monedas = new Ejercicio10();
                    monedas.moneda();
                    case 11:
                    Ejercicio11 plata = new Ejercicio11();
                    plata.salariofinal();
                    break;
                    case 12:
                    Ejercicio12 examen = new Ejercicio12();
                    examen.materia();
                    break;
                    case 13:
                    Ejercicio13 billete = new Ejercicio13();
                    billete. total();
                    break;
                    case 14:
                    Ejercicio14 xy = new Ejercicio14();
                    xy.calculo();
                    break;
                    case 15:
                    Ejercicio15 lectura = new Ejercicio15();
                    lectura.monto();
                    break;
                    case 16:
                    Ejercicio16 largo = new Ejercicio16();
                    largo.lamina();
                    break;
                    case 17:
                    Ejercicio17 platas = new  Ejercicio17();
                    platas.descuento();
                    break;
                    case 18:
                    Ejercicio18 galon =new Ejercicio18();
                    galon.cobro();
                    break;
                    case 19:
                    Ejercicio19 presu = new Ejercicio19();
                    presu.plan();
                    break;
                    case 20:
                    Ejercicio20  inte = new Ejercicio20();
                    inte.interes();
                    break;
                    case 21:
                    Ejercicio21 naranja = new Ejercicio21();
                    naranja.ganancia();
                    break;
                    case 22:
                    Ejercicio22  sobrecargo = new Ejercicio22();
                    sobrecargo.recargo();
                    break;
                    case 23:
                    Ejercicio23 dinero= new Ejercicio23();
                    dinero.ingreso();
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}


