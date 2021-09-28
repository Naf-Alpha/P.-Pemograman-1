import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Masukkan umur anda = ");
        int umur = console.nextInt();
        if (umur>40) {
            System.out.println("Anda sudah tua :v");            
        } else if (umur<40 && umur>=0) {
            System.out.println("Anda masih muda");
        } else {
            System.out.println("Anda tidak berumur");
        }
    }
}