//Kelas produk untuk merepresentasikan barang yang dijual//
class Produk {
    //atribut dengan enkapsulasi//
    private String nama;
    private double harga;
    private int stok;

    //konstruktor untuk menginisialisasi objek produk//
    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    //getter untuk mengambil nama produk//
    public String getNama(){
        return nama;
    }

    //getter untuk mengambil harga produk//
    public double getHarga(){
        return harga;
    }

    //getter untuk mengambil stok produk//
    public int getStok(){
        return stok;
    }

    //method untuk mengurangi stok setelah pembelian//
    public void kurangiStok(int jumlah){
        if (jumlah <= stok){
            stok -= jumlah;
        }else{
            System.out.println("Stok tidak cukup");
        }
    }
}

//kelas pembeli untuk merepresentasikan orang yang memberi produk//
class Pembeli{
    //atribut nama dengan enkapsulasi//
    private String nama;

    //konstruktor untuk inisialisasi nama pembeli//
    public Pembeli(String nama){
        this.nama = nama;
    }
    
    //method untuk membeli produk//
    public void beliProduk(Produk produk, int jumlah){
        System.out.println(nama + " membeli " + jumlah + " " + produk.getNama());
        produk.kurangiStok(jumlah);
    }
}

//kelas utama untuk menjalankan programnya//
public class Tugasteoriclass{
    public static void main(String[] args){
        Produk p1 = new Produk("Laptop", 7500000, 10); //membuat objek produk dengan nama, harga, stok//
        Pembeli pembeli1 = new Pembeli("Darrel"); //membuat objek pembeli dengan nama pembeli//

        pembeli1.beliProduk(p1, 2); //transaksi pembelian//
        System.out.println("Sisa stok: " + p1.getStok());
    }
}