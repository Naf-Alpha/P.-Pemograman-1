import java.util.Scanner;

public class Logico {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Masukkan Nilai A = ");
        double a = console.nextDouble();

        System.out.print("Masukkan Niali B = ");
        double b = console.nextDouble();

        System.out.println("A == B = "+(a==b));
        System.out.println("A != B = "+(a!=b));
        System.out.println("A > B = "+(a>b));
        System.out.println("A < B = "+(a<b));
        System.out.println("A >= B = "+(a>=b));
        System.out.println("A <= B = "+(a<=b));

        boolean hasil1 = (a<5 && b>2);
        boolean hasil2 = (a<5 || b>2);
        System.out.println("Hasil dari A < 5 && B > 2 = "+ hasil1);
        System.out.println("Hasil dari A < 5 || B > 2 = "+ hasil2);
    }
}