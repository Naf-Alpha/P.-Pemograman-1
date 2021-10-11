import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Masukkan umur anda = ");
        int umur = console.nextInt();
        if (umur > 40) {
            System.out.println("Anda sudah tua :v");
        } else if (umur < 40 && umur >= 0) {
            System.out.println("Anda masih muda");
            System.out.println("Masukkan umur orang tua anda");
            int umurOrtu = console.nextInt();
            if (umur < 30 && umur >= 10) {
                System.out.println("Anda memerlukan pengasuh");
            } else {
                System.out.println("Orang tua anda dapat mengasuhnya sendiri");
            }
        } else {
            System.out.println("Anda tidak berumur");
        }
    }
}