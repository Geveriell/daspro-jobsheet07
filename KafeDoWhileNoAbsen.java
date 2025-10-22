import java.util.Scanner;

public class KafeDoWhileNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input harga per produk atau barang
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int kopi, teh, roti; // jumlah pembelian tiap produk
        int totalHarga;
        String namaPelanggan;

        // perulangan do while
        do {
            System.out.println("\n--INPUT PESANAN--");
            System.out.print("Jumlah kopi : ");
            kopi = sc.nextInt();

            System.out.print("Jumlah teh : ");
            teh = sc.nextInt();

            System.out.print("Jumlah roti : ");
            roti = sc.nextInt();
            sc.nextLine(); 

            // konfirmasi 1
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            // konfirmasi 2
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);

            System.out.println("Nama Pelanggan : " + namaPelanggan);
            System.out.println("Total yang harus dibayar : Rp " + totalHarga);

        } while (true);

        System.out.println("Transaksi Selesai.");
        sc.close();
    }
}
