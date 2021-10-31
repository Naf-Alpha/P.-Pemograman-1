import java.util.Scanner;

public class Tugas8 {
    public static void main(String[] args) {
        String[] nama = new String[1000];
        double[] ipk = new double[1000];
        String[] ex = {"Exit", "exit"};
        int i;
        double total = 0;
        for (i = 1; i <= 1000; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Data " + i + " : ");
            System.out.print("Nama Mahasiswa = ");
            String namacek = scan.nextLine();
            if (namacek.equals(ex[0]) || namacek.equals(ex[1])) {
                break;
            } else {
                nama[i] = namacek;
            }
            System.out.print("IPK Mahasiswa = ");
            double nilai = scan.nextDouble();
            ipk[i] = nilai;
            System.out.println();
            total = total + ipk[i];
        }
            System.out.println("No\tNama\t\tIPK");
            System.out.println("-----------------------------");
        for (int j = 1; j < i; j++) {
            System.out.println(j + "\t" + nama[j] + "\t\t" + ipk[j]);
        }
        System.out.println("-----------------------------");
        
        System.out.println("Rata - rata\t=\t" + total / (i - 1));
    }
}
