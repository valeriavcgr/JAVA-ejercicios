package ejercicios;
import java.util.Scanner;

public class Ejercicio13 {
   
    private int n1, n2, n3, n4, n5, n6, n7, n8;
    public void setBilletes(int b50000, int b20000, int b10000, int b5000, int b2000, int b1000, int b500, int b100) {
        this.n1 = b50000;
        this.n2 = b20000;
        this.n3 = b10000;
        this.n4 = b5000;
        this.n5 = b2000;
        this.n6 = b1000;
        this.n7 = b500;
        this.n8 = b100;
    }
    public int getTotal() {
        return (n1 * 50000) + (n2 * 20000) + (n3 * 10000) + (n4 * 5000) +
               (n5 * 2000) + (n6 * 1000) + (n7 * 500) + (n8 * 100);
    }

    public void total() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Billetes de 50000 ");
        int b50000 = scanner.nextInt();
        System.out.print("Billetes de 20000  ");
        int b20000 = scanner.nextInt();
        System.out.print("Billetes de 10000  ");
        int b10000 = scanner.nextInt();
        System.out.print("Billetes de 500  ");
        int b5000 = scanner.nextInt();
        System.out.print("Billetes de 2000  ");
        int b2000 = scanner.nextInt();
        System.out.print("Billetes de 1000  ");
        int b1000 = scanner.nextInt();
        System.out.print("Billetes de 500 ");
        int b500 = scanner.nextInt();
        System.out.print("Billetes de 100  ");
        int b100 = scanner.nextInt();
        scanner.close();

        
        setBilletes(b50000, b20000, b10000, b5000, b2000, b1000, b500, b100);

       
        System.out.println("Total en el banco  " + getTotal());
    }
}

