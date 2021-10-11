import java.util.Scanner;

public class Tugas6 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka maksimal : ");
        int x = scan.nextInt();
        int i = 0;
        int pangkat = 0;
        while (i != x) {
            if(i == Math.pow(5,pangkat)) {
                System.out.println(i);
                pangkat++;
            }
            i++;            
        }
    }
}