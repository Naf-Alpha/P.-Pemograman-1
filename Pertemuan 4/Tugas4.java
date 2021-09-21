import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner tugas = new Scanner(System.in);

        System.out.print("Masukkan nilai x : ");
        double x = tugas.nextDouble();

        System.out.print("Masukkan nilai y : ");
        double y = tugas.nextDouble();

        double jumlah = x + y;
        double kurang = x - y;
        double kali = x * y;
        double bagi = x / y;
        double modulus = x % y;
        
        System.out.println("Hasil x + y = "+jumlah);
        System.out.println("Hasil x - y = "+kurang);
        System.out.println("Hasil x * y = "+kali);
        System.out.println("Hasil x / y = "+bagi);
        System.out.println("Hasil x % y = "+modulus);
    }
}