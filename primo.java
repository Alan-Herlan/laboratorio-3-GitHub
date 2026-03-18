import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Introduce un número entero P: ");
        int p = sc.nextInt();
        int k = 2;

        while (p % k != 0 && k <= Math.abs(p / 2)) {
            k = k + 1;
        }

    
        if (k > Math.abs(p / 2)) {
            System.out.println("El numero " + p + " SI es primo");
        } else {
            System.out.println("El numero " + p + " NO es primo");
        }

        sc.close();
    }
}