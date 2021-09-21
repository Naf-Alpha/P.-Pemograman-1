import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner coba = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda = ");
        String nama = coba.nextLine();

        System.out.print("Masukkan Umur Anda = ");
        int umur = coba.nextInt();

        System.out.println("Nama anda adalah "+nama);
        System.out.println("Umur anda adalah "+umur);
    }
}