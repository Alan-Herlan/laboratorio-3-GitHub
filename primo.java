import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        
        if (esPrimo(n)) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " no es primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}