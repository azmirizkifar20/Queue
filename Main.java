import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Function fungsi = new Function();
        Scanner input = new Scanner(System.in);
        boolean jalan = true;

        while (jalan) {
            System.out.println("=========================");
            System.out.println("     Kasir RM.Padang");
            System.out.println("=========================");
            System.out.println("1. Proses antrian");
            System.out.println("2. Proses daftar");
            System.out.println("3. Daftar antrian");
            System.out.println("4. Antrian pertama");
            System.out.println("0. Exit");

            System.out.print("Masukkan pilihan => "); int pilih = input.nextInt();
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama    : "); String nama = input.next();
                    System.out.print("Masukkan pesanan : "); String pesanan = input.next();
                    System.out.print("Masukkan jumlah  : "); int jumlah = input.nextInt();
                    ADT data = new ADT(nama, pesanan, jumlah);
                    fungsi.enQueue(data);
                    System.out.println();
                    break;

                case 2:
                    fungsi.deQueue();
                    System.out.println();
                    break;

                case 3:
                    fungsi.tampilkan();
                    break;

                case 4:
                    fungsi.first();
                    break;

                case 0:
                    System.out.println("Terimakasih :)");
                    jalan = false;
                    break;

                default:
                    System.out.println("Maaf perintah salah!");
                    jalan = false;
                    break;
            }
        }
    }
}
