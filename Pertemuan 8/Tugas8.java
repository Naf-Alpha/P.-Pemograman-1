import java.util.Scanner;

public class Tugas8 {
    public static void main(String[] args) {
        String[] nama = new String[5];
        double[] ipk = new double[5];
        String[] ex = {"Exit", "exit"};
        double total = 0;
        double digit = 0;
        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Data " + (i + 1) + " : ");
            System.out.print("Nama Mahasiswa = ");
            nama[i] = scan.nextLine();
            if (nama[i].equals(ex[0]) || nama[i].equals(ex[1])) {
                break;
            }
            System.out.print("IPK Mahasiswa = ");
            ipk[i] = scan.nextDouble();
            System.out.println();
        }
            System.out.println("No\tNama\t\tIPK");
            System.out.println("-----------------------------");
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equals(ex[0]) || nama[i].equals(ex[1])) {
                break;
            } else {
                System.out.println((i + 1) + "." + "\t" + nama[i] + "\t\t" + ipk[i]);
            }
        }
        for (int i = 0; i < ipk.length; i++) {
            total = total + ipk[i];
            digit = i;
        }
        System.out.println("-----------------------------");
        System.out.println("Rata - rata\t=\t" + total / (digit - 1));
    }
}