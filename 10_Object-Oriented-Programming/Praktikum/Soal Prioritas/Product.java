package Product;

public class Product {
    private String nama;
    private String deskripsi;
    private int harga;
    private int jumlah;

    public Product(String nama, String deskripsi, int harga, int jumlah) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    public void getInfo(){
        System.out.println("===");
        System.out.println("INFO PRODUK");
        System.out.println("nama: " +this.nama);
        System.out.println("deskripsi: " +this.deskripsi);
        System.out.println("harga: " +this.harga);
        System.out.println("jumlah stok: " +this.jumlah);
        System.out.println("===");

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
