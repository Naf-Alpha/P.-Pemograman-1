import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat = ");
        int x = console.nextInt();
        int sisa = x%2;
        if (sisa==0) {
            System.out.println("Anda memasukkan bilangan genap");
        } else {
            System.out.println("Maaf, anda memasukkan bilangan ganjil");
        }
        System.out.println("\"Terima Kasih :)\"");
    }
}