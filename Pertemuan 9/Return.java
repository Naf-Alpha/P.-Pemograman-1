public class Return {
    public static void main(String[] args) {
        String teks = tambahKata("Kalimat");
        System.out.println(teks);
    }
    
    public static String tambahKata(String kataAwal) {
        String kalimat = "Ini adalah " + kataAwal;
        return kalimat;

    }
}
