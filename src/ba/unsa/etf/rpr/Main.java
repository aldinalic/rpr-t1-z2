package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    private static boolean sumaCifara(int x) {
        int suma = 0;
        int temp = x;

        while (temp != 0) {
            suma += temp%10;
            temp/=10;
        }
        return x%suma == 0;
    }
    public static void main(String[] args) {

        System.out.print("Unesite neki broj: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();

        for (int i = 1; i < n; i++) {
            if (sumaCifara(i)) System.out.print(i + " ");
        }
    }
}
