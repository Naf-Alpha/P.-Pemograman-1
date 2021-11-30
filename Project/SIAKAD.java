//Nama : Muhammad Naufal Alfawwaz
//NIM  : 21537144024

import java.util.Scanner;

public class SIAKAD {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    public int jumlahData = 0;

    public static void main(String[] args) {
        SIAKAD siakad = new SIAKAD();
        int menu = 0;
        while (menu!=10) {
            menu = tampilanMenu();
            if (menu==1) {
                siakad.lihatData();
            } else if (menu==2) {
                siakad.tambahData();
            } else if (menu==3) {
                siakad.rerataIPK();
            } else if (menu==4) {
                siakad.cariDataNama();
            } else if (menu==5) {
                siakad.cariDataNIM();
            } else if (menu==6) {
                siakad.editDataNama();
            } else if (menu==7) {
                siakad.editDataNIM();
            } else if (menu==8) {
                siakad.hapusDataNama();
            } else if (menu==9) {
                siakad.hapusDataNIM();
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println(".: Menu :. \n");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Rata - Rata IPK");
        System.out.println("4. Cari Data (Nama)");
        System.out.println("5. Cari Data (NIM)");
        System.out.println("6. Edit Nama");
        System.out.println("7. Edit NIM");
        System.out.println("8. Hapus Data (Nama)");
        System.out.println("9. Hapus Data (NIM)");
        System.out.println("10. Keluar \n");
        System.out.print("Pilih menu = ");
        int menu = scan.nextInt();
        return menu;
        
    }

    private void lihatData() {
        if (jumlahData==0) {
            System.out.println("Belum ada data\n");
        } else {
            System.out.println("\nBerikut data mahasiswa : ");
            for (int i=0; i<jumlahData;i++) {
                System.out.print((i + 1) + ".");
                mahasiswa[i].getDetail();
            }
        } System.out.println();
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Mahasiswa = ");
        String nama = scan.nextLine();

        System.out.print("Masukkan NIM Mahasiswa = ");
        String nim = scan.nextLine();

        System.out.print("Masukkan Umur Mahasiswa = ");
        int umur = scan.nextInt();

        System.out.print("Masukkan IPK Mahasiswa = ");
        double ipk = scan.nextDouble();

        System.out.print("Masukkan Semester = ");
        int sem = scan.nextInt();

        Mahasiswa dataMahasiswa = new Mahasiswa(nama, nim, ipk,sem);
        dataMahasiswa.setUmur(umur);
        mahasiswa[jumlahData] = dataMahasiswa;
        jumlahData++;
        lihatData();
    }

    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahData; i++) {
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahData;
        System.out.println("Rata - Rata IPK Mahasiswa = "+ rerata + "\n");
    }

    public int getIndexNama(String nama) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNama().equals(nama)) {
                return i;
            }
        } return -1;
    }

    public int getIndexNIM (String nim) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNIM().equals(nim)) {
                return i;
            }
        } return -1;
    }

    public void cariDataNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama = ");
        String nama = scan.nextLine();
        int indexNama = getIndexNama(nama);
        if (indexNama == -1) {
            System.out.println("Nama yang anda cari tidak ditemukan");
        } else {
            System.out.print("->");
            mahasiswa[indexNama].getDetail();
        } System.out.println();
    }
    public void cariDataNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM = ");
        String nim = scan.nextLine();
        int indexNIM = getIndexNIM(nim);
        if (indexNIM == -1) {
            System.out.println("NIM yang anda cari tidak ditemukan");
        } else {
            System.out.print("->");
            mahasiswa[indexNIM].getDetail();
        } System.out.println();
    }
    
    private void editDataNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama = ");
        String nama = scan.nextLine();
        int indexNama = getIndexNama(nama);
        if (indexNama == -1) {
            System.out.println("Nama yang anda cari tidak ditemukan");
        } else {
            System.out.print("->");
            mahasiswa[indexNama].getDetail();
            System.out.println();
            System.out.print("Masukkan nama baru = ");
            String editNama = scan.nextLine();
            mahasiswa[indexNama].setNama(editNama);
            System.out.print("->");
            mahasiswa[indexNama].getDetail();
        } System.out.println();
    }

    private void editDataNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM = ");
        String nim = scan.nextLine();
        int indexNIM = getIndexNIM(nim);
        if (indexNIM == -1) {
            System.out.println("NIM yang anda cari tidak ditemukan");
        } else {
            System.out.print("->");
            mahasiswa[indexNIM].getDetail();
            System.out.println();
            System.out.print("Masukkan NIM baru = ");
            String editNIM = scan.nextLine();
            mahasiswa[indexNIM].setNIM(editNIM);
            System.out.print("->");
            mahasiswa[indexNIM].getDetail();
        } System.out.println();
    }

    private void hapusDataNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama = ");
        String nama = scan.nextLine();
        int indexNama = getIndexNama(nama);
        if (indexNama == -1) {
            System.out.println("Nama yang anda cari tidak ditemukan");
        } else {
            for (int i=indexNama; i<jumlahData; i++) {
                mahasiswa[i] = mahasiswa[i+1];
            }
            jumlahData--;
            lihatData();
        }
    }

    private void hapusDataNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM = ");
        String nim = scan.nextLine();
        int indexNIM = getIndexNIM(nim);
        if (indexNIM == -1) {
            System.out.println("NIM yang anda cari tidak ditemukan");
        } else {
            for (int i=indexNIM; i<jumlahData; i++) {
                mahasiswa[i] = mahasiswa[i+1];
            }
            jumlahData--;
            lihatData();
        }
    }
}