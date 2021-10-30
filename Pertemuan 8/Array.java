public class Array {
    public static void main(String[] args) {
        String[] binatang = {"Ayam", "Kambing", "Kuda"};
        System.out.println(binatang[2]);

        System.out.println();

        for (String item : binatang) {
            System.out.println(item);
        }
        System.out.println();

        int[][] multidimensi = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(multidimensi[0][2]);

    }
}