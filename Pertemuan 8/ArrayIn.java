import java.util.Scanner;

public class ArrayIn {
    public static void main(String[] args) {
        int[] bilangan = new int[5];
        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan bilangan ke-" + i + " = ");
            bilangan[i] = scan.nextInt();
        }
        for (int i = 0; i < bilangan.length; i++) {
            System.out.println("Bilangan ke-" + i + " = " + bilangan[i]);
        }
    }
}
