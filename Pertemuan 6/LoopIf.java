import java.util.Scanner;

public class LoopIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah deret bilangan genap yang akan ditampilkan = ");
        int n = scan.nextInt();
        int i = 0;
        while (i != n) {
            if (i % 2 == 0) {
            System.out.println(i);
            }
            i++;
        }
    }
}