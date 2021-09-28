import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda : ");
        String nama = console.nextLine();

        System.out.print("Masukkan NIM Anda : ");
        String nim = console.nextLine();

        System.out.print("Masukkan Tahun Angkatan : ");
        int tahun = console.nextInt();
        int lulus = 2021 - tahun;

        System.out.print("Masukkan IPK Anda : ");
        float ipk = console.nextFloat();

        System.out.print("Mahasiswa bernama "+nama);
        System.out.print(" dengan NIM "+nim);
        System.out.println(" dan lama studi "+ lulus+" Tahun");
        
        if (ipk>=3.51 && lulus<=4 && ipk<=4.0) {
            System.out.println("\"Selamat, Anda merupakan Mahasiswa Summa Cumlaud");
        } else if (ipk>=3.51 && ipk<=4.0) {
            System.out.println("\"Selamat, Anda merupakan Mahasiswa Cumlaud\"");
        } else if (ipk>=3.01 && ipk<3.51) {
            System.out.println("\"Selamat, Anda mendapatkan IPK dengan predikat Sangat Memuaskan\"");
        } else if (ipk>=2.76 && ipk<3.01) {
            System.out.println("\"Selamat, Anda mendapatkan IPK dengan predikat Memuaskan\"");
        } else if (ipk>=2.0 && ipk<2.76) {
            System.out.println("\"Selamat, Anda mendapatkan IPK dengan predikat Cukup\"");
        } else if (ipk<2.0 && ipk>=0) {
            System.out.println("\"Mohon Maaf, Anda mendapatkan IPK dengan predikat Tidak Lulus\"");
        } else {
            System.out.println("IPK yang anda masukkan tidak valid");
        }
        System.out.print("\"Terima Kasih :)\"");
    }    
}