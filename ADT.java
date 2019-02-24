public class ADT {
    String nama;
    String pesanan;
    int jumlah;

    public ADT(String nama, String pesanan, int jumlah) {
        this.nama = nama;
        this.pesanan = pesanan;
        this.jumlah = jumlah;
    }

    public void tampil(){
        System.out.println("Nama    : " + nama);
        System.out.println("Pesanan : " + pesanan);
        System.out.println("Jumlah  : " + jumlah);
        System.out.println();
    }
}
