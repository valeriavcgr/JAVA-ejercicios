//Un hombre desea saber cuánto dinero se generará por concepto de intereses sobre la cantidad
//que tiene en inversión en el banco. El decidirá reinvertir los intereses siempre y cuando éstos
//excedan a $7000 y en ese caso, desea saber cuánto dinero tendrá finalmente en su cuenta.
import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad invertida en el banco  ");
        double dinero = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de los intereses ");
        double tasa = scanner.nextDouble();
        double intereses = dinero * (tasa / 100);
        System.out.println("los inetreses generados son " + intereses);
        if (intereses > 7000) {
            double saldo = dinero + intereses;
            System.out.println("Los intereses exceden los $7000. Reinvertidos, el total en la cuenta sería: $" + saldo);
        } else {
            System.out.println("Los intereses no exceden los $7000");
        }
        scanner.close();
    }
}
