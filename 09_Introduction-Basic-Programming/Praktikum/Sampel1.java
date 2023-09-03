public class Sampel1 {
    public static void main(String[] args) {
        // harga beli = x
        // harga jual = y
        // harga jual - harga beli = z
        int x = 15000;
        int y = 30000;

        int z = y - x;

        if (z > 0) {
            System.out.println("Untung sebesar:" + z);
        } else if (z < 0) {
            System.out.println("Rugi Sebesar:" + z);
        } else {
            System.out.println("sama saja");
        }
    }
}
