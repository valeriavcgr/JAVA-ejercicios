package ejercicioscondicionales;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento (dd/MM/yyyy) ");
        String fecha = scanner.nextLine();

        // Convertir la fecha ingresada en un objeto LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nacio= LocalDate.parse(fecha, formatter);

        // Obtener día y mes de nacimiento
        int dia =nacio .getDayOfMonth();
        int mes = nacio .getMonthValue();
        // Calcular la edad
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - nacio .getYear();
        if ( nacio.plusYears(edad).isAfter(fechaActual)) {
            edad--;
        }
        String signo = determinarSigno(dia, mes);

        System.out.println("Su signo zodiacal es " + signo);
        System.out.println("Su edad es " + edad + " años.");

        scanner.close();
    }
    public static String determinarSigno(int dia, int mes) {
        if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) return "Acuario";
        if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 19)) return "Piscis";
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) return "Aries";
        if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) return "Tauro";
        if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) return "Géminis";
        if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) return "Cáncer";
        if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) return "Leo";
        if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 22)) return "Virgo";
        if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) return "Libra";
        if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) return "Escorpión";
        if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) return "Sagitario";
        return "Capricornio"; 
    }
}
